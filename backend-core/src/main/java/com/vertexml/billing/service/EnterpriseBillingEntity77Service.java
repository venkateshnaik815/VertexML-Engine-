package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity77;
import com.vertexml.billing.repo.EnterpriseBillingEntity77Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity77Service {
    private final EnterpriseBillingEntity77Repository repo;
    public EnterpriseBillingEntity77Service(EnterpriseBillingEntity77Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity77> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity77 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity77 create(EnterpriseBillingEntity77 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity77 update(UUID id, EnterpriseBillingEntity77 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity77> all = repo.findAll();
        for(EnterpriseBillingEntity77 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
