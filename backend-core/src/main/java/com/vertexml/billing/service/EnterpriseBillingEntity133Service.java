package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity133;
import com.vertexml.billing.repo.EnterpriseBillingEntity133Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity133Service {
    private final EnterpriseBillingEntity133Repository repo;
    public EnterpriseBillingEntity133Service(EnterpriseBillingEntity133Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity133> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity133 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity133 create(EnterpriseBillingEntity133 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity133 update(UUID id, EnterpriseBillingEntity133 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity133> all = repo.findAll();
        for(EnterpriseBillingEntity133 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
