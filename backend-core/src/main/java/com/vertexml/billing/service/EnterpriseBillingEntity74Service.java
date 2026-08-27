package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity74;
import com.vertexml.billing.repo.EnterpriseBillingEntity74Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity74Service {
    private final EnterpriseBillingEntity74Repository repo;
    public EnterpriseBillingEntity74Service(EnterpriseBillingEntity74Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity74> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity74 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity74 create(EnterpriseBillingEntity74 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity74 update(UUID id, EnterpriseBillingEntity74 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity74> all = repo.findAll();
        for(EnterpriseBillingEntity74 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
