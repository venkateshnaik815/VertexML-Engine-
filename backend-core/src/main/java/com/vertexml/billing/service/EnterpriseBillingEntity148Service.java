package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity148;
import com.vertexml.billing.repo.EnterpriseBillingEntity148Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity148Service {
    private final EnterpriseBillingEntity148Repository repo;
    public EnterpriseBillingEntity148Service(EnterpriseBillingEntity148Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity148> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity148 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity148 create(EnterpriseBillingEntity148 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity148 update(UUID id, EnterpriseBillingEntity148 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity148> all = repo.findAll();
        for(EnterpriseBillingEntity148 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
