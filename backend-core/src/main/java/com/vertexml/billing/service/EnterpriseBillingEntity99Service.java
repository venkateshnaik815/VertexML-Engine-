package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity99;
import com.vertexml.billing.repo.EnterpriseBillingEntity99Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity99Service {
    private final EnterpriseBillingEntity99Repository repo;
    public EnterpriseBillingEntity99Service(EnterpriseBillingEntity99Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity99> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity99 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity99 create(EnterpriseBillingEntity99 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity99 update(UUID id, EnterpriseBillingEntity99 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity99> all = repo.findAll();
        for(EnterpriseBillingEntity99 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
