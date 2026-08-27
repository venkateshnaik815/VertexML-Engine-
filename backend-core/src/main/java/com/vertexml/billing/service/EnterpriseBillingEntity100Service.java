package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity100;
import com.vertexml.billing.repo.EnterpriseBillingEntity100Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity100Service {
    private final EnterpriseBillingEntity100Repository repo;
    public EnterpriseBillingEntity100Service(EnterpriseBillingEntity100Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity100> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity100 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity100 create(EnterpriseBillingEntity100 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity100 update(UUID id, EnterpriseBillingEntity100 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity100> all = repo.findAll();
        for(EnterpriseBillingEntity100 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
