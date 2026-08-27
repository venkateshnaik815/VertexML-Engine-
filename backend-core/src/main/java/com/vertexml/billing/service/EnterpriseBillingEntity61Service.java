package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity61;
import com.vertexml.billing.repo.EnterpriseBillingEntity61Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity61Service {
    private final EnterpriseBillingEntity61Repository repo;
    public EnterpriseBillingEntity61Service(EnterpriseBillingEntity61Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity61> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity61 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity61 create(EnterpriseBillingEntity61 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity61 update(UUID id, EnterpriseBillingEntity61 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity61> all = repo.findAll();
        for(EnterpriseBillingEntity61 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
