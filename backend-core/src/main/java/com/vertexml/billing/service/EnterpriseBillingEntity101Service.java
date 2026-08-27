package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity101;
import com.vertexml.billing.repo.EnterpriseBillingEntity101Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity101Service {
    private final EnterpriseBillingEntity101Repository repo;
    public EnterpriseBillingEntity101Service(EnterpriseBillingEntity101Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity101> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity101 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity101 create(EnterpriseBillingEntity101 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity101 update(UUID id, EnterpriseBillingEntity101 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity101> all = repo.findAll();
        for(EnterpriseBillingEntity101 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
