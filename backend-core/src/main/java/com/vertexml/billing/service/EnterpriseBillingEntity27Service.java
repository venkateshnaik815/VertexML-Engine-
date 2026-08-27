package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity27;
import com.vertexml.billing.repo.EnterpriseBillingEntity27Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity27Service {
    private final EnterpriseBillingEntity27Repository repo;
    public EnterpriseBillingEntity27Service(EnterpriseBillingEntity27Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity27> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity27 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity27 create(EnterpriseBillingEntity27 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity27 update(UUID id, EnterpriseBillingEntity27 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity27> all = repo.findAll();
        for(EnterpriseBillingEntity27 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
