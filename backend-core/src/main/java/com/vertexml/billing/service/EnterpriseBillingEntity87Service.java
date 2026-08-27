package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity87;
import com.vertexml.billing.repo.EnterpriseBillingEntity87Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity87Service {
    private final EnterpriseBillingEntity87Repository repo;
    public EnterpriseBillingEntity87Service(EnterpriseBillingEntity87Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity87> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity87 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity87 create(EnterpriseBillingEntity87 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity87 update(UUID id, EnterpriseBillingEntity87 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity87> all = repo.findAll();
        for(EnterpriseBillingEntity87 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
