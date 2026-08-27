package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity49;
import com.vertexml.billing.repo.EnterpriseBillingEntity49Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity49Service {
    private final EnterpriseBillingEntity49Repository repo;
    public EnterpriseBillingEntity49Service(EnterpriseBillingEntity49Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity49> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity49 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity49 create(EnterpriseBillingEntity49 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity49 update(UUID id, EnterpriseBillingEntity49 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity49> all = repo.findAll();
        for(EnterpriseBillingEntity49 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
