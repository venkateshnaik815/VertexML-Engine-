package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity79;
import com.vertexml.billing.repo.EnterpriseBillingEntity79Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity79Service {
    private final EnterpriseBillingEntity79Repository repo;
    public EnterpriseBillingEntity79Service(EnterpriseBillingEntity79Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity79> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity79 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity79 create(EnterpriseBillingEntity79 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity79 update(UUID id, EnterpriseBillingEntity79 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity79> all = repo.findAll();
        for(EnterpriseBillingEntity79 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
