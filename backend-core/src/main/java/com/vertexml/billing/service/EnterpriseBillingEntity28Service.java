package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity28;
import com.vertexml.billing.repo.EnterpriseBillingEntity28Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity28Service {
    private final EnterpriseBillingEntity28Repository repo;
    public EnterpriseBillingEntity28Service(EnterpriseBillingEntity28Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity28> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity28 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity28 create(EnterpriseBillingEntity28 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity28 update(UUID id, EnterpriseBillingEntity28 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity28> all = repo.findAll();
        for(EnterpriseBillingEntity28 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
