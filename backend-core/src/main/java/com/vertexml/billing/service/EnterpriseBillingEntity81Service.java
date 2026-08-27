package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity81;
import com.vertexml.billing.repo.EnterpriseBillingEntity81Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity81Service {
    private final EnterpriseBillingEntity81Repository repo;
    public EnterpriseBillingEntity81Service(EnterpriseBillingEntity81Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity81> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity81 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity81 create(EnterpriseBillingEntity81 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity81 update(UUID id, EnterpriseBillingEntity81 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity81> all = repo.findAll();
        for(EnterpriseBillingEntity81 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
