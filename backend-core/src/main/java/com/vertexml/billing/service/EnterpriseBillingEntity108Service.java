package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity108;
import com.vertexml.billing.repo.EnterpriseBillingEntity108Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity108Service {
    private final EnterpriseBillingEntity108Repository repo;
    public EnterpriseBillingEntity108Service(EnterpriseBillingEntity108Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity108> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity108 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity108 create(EnterpriseBillingEntity108 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity108 update(UUID id, EnterpriseBillingEntity108 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity108> all = repo.findAll();
        for(EnterpriseBillingEntity108 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
