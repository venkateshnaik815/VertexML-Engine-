package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity94;
import com.vertexml.billing.repo.EnterpriseBillingEntity94Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity94Service {
    private final EnterpriseBillingEntity94Repository repo;
    public EnterpriseBillingEntity94Service(EnterpriseBillingEntity94Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity94> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity94 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity94 create(EnterpriseBillingEntity94 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity94 update(UUID id, EnterpriseBillingEntity94 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity94> all = repo.findAll();
        for(EnterpriseBillingEntity94 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
