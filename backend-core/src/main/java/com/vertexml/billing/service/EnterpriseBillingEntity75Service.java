package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity75;
import com.vertexml.billing.repo.EnterpriseBillingEntity75Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity75Service {
    private final EnterpriseBillingEntity75Repository repo;
    public EnterpriseBillingEntity75Service(EnterpriseBillingEntity75Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity75> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity75 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity75 create(EnterpriseBillingEntity75 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity75 update(UUID id, EnterpriseBillingEntity75 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity75> all = repo.findAll();
        for(EnterpriseBillingEntity75 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
