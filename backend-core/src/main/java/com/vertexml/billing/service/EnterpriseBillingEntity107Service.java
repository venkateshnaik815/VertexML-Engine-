package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity107;
import com.vertexml.billing.repo.EnterpriseBillingEntity107Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity107Service {
    private final EnterpriseBillingEntity107Repository repo;
    public EnterpriseBillingEntity107Service(EnterpriseBillingEntity107Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity107> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity107 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity107 create(EnterpriseBillingEntity107 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity107 update(UUID id, EnterpriseBillingEntity107 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity107> all = repo.findAll();
        for(EnterpriseBillingEntity107 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
