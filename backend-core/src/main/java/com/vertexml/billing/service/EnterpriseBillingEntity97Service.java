package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity97;
import com.vertexml.billing.repo.EnterpriseBillingEntity97Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity97Service {
    private final EnterpriseBillingEntity97Repository repo;
    public EnterpriseBillingEntity97Service(EnterpriseBillingEntity97Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity97> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity97 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity97 create(EnterpriseBillingEntity97 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity97 update(UUID id, EnterpriseBillingEntity97 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity97> all = repo.findAll();
        for(EnterpriseBillingEntity97 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
