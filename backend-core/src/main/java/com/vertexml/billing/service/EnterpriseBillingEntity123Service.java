package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity123;
import com.vertexml.billing.repo.EnterpriseBillingEntity123Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity123Service {
    private final EnterpriseBillingEntity123Repository repo;
    public EnterpriseBillingEntity123Service(EnterpriseBillingEntity123Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity123> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity123 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity123 create(EnterpriseBillingEntity123 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity123 update(UUID id, EnterpriseBillingEntity123 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity123> all = repo.findAll();
        for(EnterpriseBillingEntity123 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
