package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity66;
import com.vertexml.billing.repo.EnterpriseBillingEntity66Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity66Service {
    private final EnterpriseBillingEntity66Repository repo;
    public EnterpriseBillingEntity66Service(EnterpriseBillingEntity66Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity66> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity66 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity66 create(EnterpriseBillingEntity66 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity66 update(UUID id, EnterpriseBillingEntity66 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity66> all = repo.findAll();
        for(EnterpriseBillingEntity66 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
