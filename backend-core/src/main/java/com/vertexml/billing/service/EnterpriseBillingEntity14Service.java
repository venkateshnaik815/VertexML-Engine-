package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity14;
import com.vertexml.billing.repo.EnterpriseBillingEntity14Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity14Service {
    private final EnterpriseBillingEntity14Repository repo;
    public EnterpriseBillingEntity14Service(EnterpriseBillingEntity14Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity14> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity14 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity14 create(EnterpriseBillingEntity14 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity14 update(UUID id, EnterpriseBillingEntity14 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity14> all = repo.findAll();
        for(EnterpriseBillingEntity14 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
