package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity85;
import com.vertexml.billing.repo.EnterpriseBillingEntity85Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity85Service {
    private final EnterpriseBillingEntity85Repository repo;
    public EnterpriseBillingEntity85Service(EnterpriseBillingEntity85Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity85> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity85 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity85 create(EnterpriseBillingEntity85 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity85 update(UUID id, EnterpriseBillingEntity85 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity85> all = repo.findAll();
        for(EnterpriseBillingEntity85 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
