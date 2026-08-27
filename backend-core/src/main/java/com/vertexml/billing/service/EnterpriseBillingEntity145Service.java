package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity145;
import com.vertexml.billing.repo.EnterpriseBillingEntity145Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity145Service {
    private final EnterpriseBillingEntity145Repository repo;
    public EnterpriseBillingEntity145Service(EnterpriseBillingEntity145Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity145> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity145 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity145 create(EnterpriseBillingEntity145 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity145 update(UUID id, EnterpriseBillingEntity145 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity145> all = repo.findAll();
        for(EnterpriseBillingEntity145 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
