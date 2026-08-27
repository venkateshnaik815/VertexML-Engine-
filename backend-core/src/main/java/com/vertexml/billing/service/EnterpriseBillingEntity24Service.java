package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity24;
import com.vertexml.billing.repo.EnterpriseBillingEntity24Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity24Service {
    private final EnterpriseBillingEntity24Repository repo;
    public EnterpriseBillingEntity24Service(EnterpriseBillingEntity24Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity24> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity24 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity24 create(EnterpriseBillingEntity24 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity24 update(UUID id, EnterpriseBillingEntity24 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity24> all = repo.findAll();
        for(EnterpriseBillingEntity24 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
