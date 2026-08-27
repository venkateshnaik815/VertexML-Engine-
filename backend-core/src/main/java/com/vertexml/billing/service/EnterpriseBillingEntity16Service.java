package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity16;
import com.vertexml.billing.repo.EnterpriseBillingEntity16Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity16Service {
    private final EnterpriseBillingEntity16Repository repo;
    public EnterpriseBillingEntity16Service(EnterpriseBillingEntity16Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity16> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity16 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity16 create(EnterpriseBillingEntity16 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity16 update(UUID id, EnterpriseBillingEntity16 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity16> all = repo.findAll();
        for(EnterpriseBillingEntity16 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
