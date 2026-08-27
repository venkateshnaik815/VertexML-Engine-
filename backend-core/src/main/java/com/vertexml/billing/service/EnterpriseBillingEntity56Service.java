package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity56;
import com.vertexml.billing.repo.EnterpriseBillingEntity56Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity56Service {
    private final EnterpriseBillingEntity56Repository repo;
    public EnterpriseBillingEntity56Service(EnterpriseBillingEntity56Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity56> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity56 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity56 create(EnterpriseBillingEntity56 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity56 update(UUID id, EnterpriseBillingEntity56 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity56> all = repo.findAll();
        for(EnterpriseBillingEntity56 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
