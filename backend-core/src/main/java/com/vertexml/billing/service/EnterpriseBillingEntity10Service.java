package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity10;
import com.vertexml.billing.repo.EnterpriseBillingEntity10Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity10Service {
    private final EnterpriseBillingEntity10Repository repo;
    public EnterpriseBillingEntity10Service(EnterpriseBillingEntity10Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity10> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity10 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity10 create(EnterpriseBillingEntity10 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity10 update(UUID id, EnterpriseBillingEntity10 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity10> all = repo.findAll();
        for(EnterpriseBillingEntity10 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
