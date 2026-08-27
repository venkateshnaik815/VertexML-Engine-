package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity114;
import com.vertexml.billing.repo.EnterpriseBillingEntity114Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity114Service {
    private final EnterpriseBillingEntity114Repository repo;
    public EnterpriseBillingEntity114Service(EnterpriseBillingEntity114Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity114> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity114 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity114 create(EnterpriseBillingEntity114 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity114 update(UUID id, EnterpriseBillingEntity114 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity114> all = repo.findAll();
        for(EnterpriseBillingEntity114 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
