package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity53;
import com.vertexml.billing.repo.EnterpriseBillingEntity53Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity53Service {
    private final EnterpriseBillingEntity53Repository repo;
    public EnterpriseBillingEntity53Service(EnterpriseBillingEntity53Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity53> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity53 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity53 create(EnterpriseBillingEntity53 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity53 update(UUID id, EnterpriseBillingEntity53 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity53> all = repo.findAll();
        for(EnterpriseBillingEntity53 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
