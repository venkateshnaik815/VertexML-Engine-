package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity147;
import com.vertexml.billing.repo.EnterpriseBillingEntity147Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity147Service {
    private final EnterpriseBillingEntity147Repository repo;
    public EnterpriseBillingEntity147Service(EnterpriseBillingEntity147Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity147> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity147 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity147 create(EnterpriseBillingEntity147 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity147 update(UUID id, EnterpriseBillingEntity147 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity147> all = repo.findAll();
        for(EnterpriseBillingEntity147 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
