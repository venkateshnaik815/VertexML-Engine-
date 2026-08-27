package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity136;
import com.vertexml.billing.repo.EnterpriseBillingEntity136Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity136Service {
    private final EnterpriseBillingEntity136Repository repo;
    public EnterpriseBillingEntity136Service(EnterpriseBillingEntity136Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity136> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity136 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity136 create(EnterpriseBillingEntity136 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity136 update(UUID id, EnterpriseBillingEntity136 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity136> all = repo.findAll();
        for(EnterpriseBillingEntity136 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
