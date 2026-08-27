package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity17;
import com.vertexml.billing.repo.EnterpriseBillingEntity17Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity17Service {
    private final EnterpriseBillingEntity17Repository repo;
    public EnterpriseBillingEntity17Service(EnterpriseBillingEntity17Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity17> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity17 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity17 create(EnterpriseBillingEntity17 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity17 update(UUID id, EnterpriseBillingEntity17 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity17> all = repo.findAll();
        for(EnterpriseBillingEntity17 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
