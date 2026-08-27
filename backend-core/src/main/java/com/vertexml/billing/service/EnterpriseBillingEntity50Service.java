package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity50;
import com.vertexml.billing.repo.EnterpriseBillingEntity50Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity50Service {
    private final EnterpriseBillingEntity50Repository repo;
    public EnterpriseBillingEntity50Service(EnterpriseBillingEntity50Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity50> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity50 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity50 create(EnterpriseBillingEntity50 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity50 update(UUID id, EnterpriseBillingEntity50 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity50> all = repo.findAll();
        for(EnterpriseBillingEntity50 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
