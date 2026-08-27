package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity71;
import com.vertexml.billing.repo.EnterpriseBillingEntity71Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity71Service {
    private final EnterpriseBillingEntity71Repository repo;
    public EnterpriseBillingEntity71Service(EnterpriseBillingEntity71Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity71> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity71 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity71 create(EnterpriseBillingEntity71 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity71 update(UUID id, EnterpriseBillingEntity71 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity71> all = repo.findAll();
        for(EnterpriseBillingEntity71 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
