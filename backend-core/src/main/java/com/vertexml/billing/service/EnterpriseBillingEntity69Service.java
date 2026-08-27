package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity69;
import com.vertexml.billing.repo.EnterpriseBillingEntity69Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity69Service {
    private final EnterpriseBillingEntity69Repository repo;
    public EnterpriseBillingEntity69Service(EnterpriseBillingEntity69Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity69> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity69 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity69 create(EnterpriseBillingEntity69 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity69 update(UUID id, EnterpriseBillingEntity69 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity69> all = repo.findAll();
        for(EnterpriseBillingEntity69 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
