package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity146;
import com.vertexml.billing.repo.EnterpriseBillingEntity146Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity146Service {
    private final EnterpriseBillingEntity146Repository repo;
    public EnterpriseBillingEntity146Service(EnterpriseBillingEntity146Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity146> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity146 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity146 create(EnterpriseBillingEntity146 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity146 update(UUID id, EnterpriseBillingEntity146 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity146> all = repo.findAll();
        for(EnterpriseBillingEntity146 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
