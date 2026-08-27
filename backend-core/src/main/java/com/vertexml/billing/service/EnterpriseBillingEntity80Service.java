package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity80;
import com.vertexml.billing.repo.EnterpriseBillingEntity80Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity80Service {
    private final EnterpriseBillingEntity80Repository repo;
    public EnterpriseBillingEntity80Service(EnterpriseBillingEntity80Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity80> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity80 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity80 create(EnterpriseBillingEntity80 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity80 update(UUID id, EnterpriseBillingEntity80 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity80> all = repo.findAll();
        for(EnterpriseBillingEntity80 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
