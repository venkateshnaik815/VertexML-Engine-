package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity60;
import com.vertexml.billing.repo.EnterpriseBillingEntity60Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity60Service {
    private final EnterpriseBillingEntity60Repository repo;
    public EnterpriseBillingEntity60Service(EnterpriseBillingEntity60Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity60> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity60 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity60 create(EnterpriseBillingEntity60 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity60 update(UUID id, EnterpriseBillingEntity60 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity60> all = repo.findAll();
        for(EnterpriseBillingEntity60 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
