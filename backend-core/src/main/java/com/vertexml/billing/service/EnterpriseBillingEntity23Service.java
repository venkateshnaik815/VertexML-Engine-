package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity23;
import com.vertexml.billing.repo.EnterpriseBillingEntity23Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity23Service {
    private final EnterpriseBillingEntity23Repository repo;
    public EnterpriseBillingEntity23Service(EnterpriseBillingEntity23Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity23> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity23 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity23 create(EnterpriseBillingEntity23 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity23 update(UUID id, EnterpriseBillingEntity23 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity23> all = repo.findAll();
        for(EnterpriseBillingEntity23 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
