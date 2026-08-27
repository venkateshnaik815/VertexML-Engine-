package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity47;
import com.vertexml.billing.repo.EnterpriseBillingEntity47Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity47Service {
    private final EnterpriseBillingEntity47Repository repo;
    public EnterpriseBillingEntity47Service(EnterpriseBillingEntity47Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity47> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity47 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity47 create(EnterpriseBillingEntity47 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity47 update(UUID id, EnterpriseBillingEntity47 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity47> all = repo.findAll();
        for(EnterpriseBillingEntity47 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
