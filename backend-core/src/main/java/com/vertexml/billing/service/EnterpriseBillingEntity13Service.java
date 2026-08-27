package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity13;
import com.vertexml.billing.repo.EnterpriseBillingEntity13Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity13Service {
    private final EnterpriseBillingEntity13Repository repo;
    public EnterpriseBillingEntity13Service(EnterpriseBillingEntity13Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity13> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity13 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity13 create(EnterpriseBillingEntity13 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity13 update(UUID id, EnterpriseBillingEntity13 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity13> all = repo.findAll();
        for(EnterpriseBillingEntity13 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
