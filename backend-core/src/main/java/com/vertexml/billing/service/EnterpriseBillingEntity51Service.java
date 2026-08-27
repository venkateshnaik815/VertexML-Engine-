package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity51;
import com.vertexml.billing.repo.EnterpriseBillingEntity51Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity51Service {
    private final EnterpriseBillingEntity51Repository repo;
    public EnterpriseBillingEntity51Service(EnterpriseBillingEntity51Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity51> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity51 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity51 create(EnterpriseBillingEntity51 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity51 update(UUID id, EnterpriseBillingEntity51 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity51> all = repo.findAll();
        for(EnterpriseBillingEntity51 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
