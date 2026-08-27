package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity31;
import com.vertexml.billing.repo.EnterpriseBillingEntity31Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity31Service {
    private final EnterpriseBillingEntity31Repository repo;
    public EnterpriseBillingEntity31Service(EnterpriseBillingEntity31Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity31> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity31 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity31 create(EnterpriseBillingEntity31 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity31 update(UUID id, EnterpriseBillingEntity31 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity31> all = repo.findAll();
        for(EnterpriseBillingEntity31 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
