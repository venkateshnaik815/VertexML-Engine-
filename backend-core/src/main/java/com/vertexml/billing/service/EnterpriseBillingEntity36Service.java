package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity36;
import com.vertexml.billing.repo.EnterpriseBillingEntity36Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity36Service {
    private final EnterpriseBillingEntity36Repository repo;
    public EnterpriseBillingEntity36Service(EnterpriseBillingEntity36Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity36> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity36 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity36 create(EnterpriseBillingEntity36 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity36 update(UUID id, EnterpriseBillingEntity36 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity36> all = repo.findAll();
        for(EnterpriseBillingEntity36 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
