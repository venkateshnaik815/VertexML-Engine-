package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity45;
import com.vertexml.billing.repo.EnterpriseBillingEntity45Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity45Service {
    private final EnterpriseBillingEntity45Repository repo;
    public EnterpriseBillingEntity45Service(EnterpriseBillingEntity45Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity45> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity45 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity45 create(EnterpriseBillingEntity45 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity45 update(UUID id, EnterpriseBillingEntity45 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity45> all = repo.findAll();
        for(EnterpriseBillingEntity45 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
