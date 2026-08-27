package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity91;
import com.vertexml.billing.repo.EnterpriseBillingEntity91Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity91Service {
    private final EnterpriseBillingEntity91Repository repo;
    public EnterpriseBillingEntity91Service(EnterpriseBillingEntity91Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity91> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity91 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity91 create(EnterpriseBillingEntity91 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity91 update(UUID id, EnterpriseBillingEntity91 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity91> all = repo.findAll();
        for(EnterpriseBillingEntity91 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
