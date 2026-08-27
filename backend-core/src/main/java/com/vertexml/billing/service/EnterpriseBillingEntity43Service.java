package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity43;
import com.vertexml.billing.repo.EnterpriseBillingEntity43Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity43Service {
    private final EnterpriseBillingEntity43Repository repo;
    public EnterpriseBillingEntity43Service(EnterpriseBillingEntity43Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity43> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity43 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity43 create(EnterpriseBillingEntity43 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity43 update(UUID id, EnterpriseBillingEntity43 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity43> all = repo.findAll();
        for(EnterpriseBillingEntity43 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
