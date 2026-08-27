package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity113;
import com.vertexml.billing.repo.EnterpriseBillingEntity113Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity113Service {
    private final EnterpriseBillingEntity113Repository repo;
    public EnterpriseBillingEntity113Service(EnterpriseBillingEntity113Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity113> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity113 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity113 create(EnterpriseBillingEntity113 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity113 update(UUID id, EnterpriseBillingEntity113 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity113> all = repo.findAll();
        for(EnterpriseBillingEntity113 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
