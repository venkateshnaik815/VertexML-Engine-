package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity142;
import com.vertexml.billing.repo.EnterpriseBillingEntity142Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity142Service {
    private final EnterpriseBillingEntity142Repository repo;
    public EnterpriseBillingEntity142Service(EnterpriseBillingEntity142Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity142> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity142 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity142 create(EnterpriseBillingEntity142 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity142 update(UUID id, EnterpriseBillingEntity142 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity142> all = repo.findAll();
        for(EnterpriseBillingEntity142 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
