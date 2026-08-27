package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity46;
import com.vertexml.billing.repo.EnterpriseBillingEntity46Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity46Service {
    private final EnterpriseBillingEntity46Repository repo;
    public EnterpriseBillingEntity46Service(EnterpriseBillingEntity46Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity46> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity46 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity46 create(EnterpriseBillingEntity46 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity46 update(UUID id, EnterpriseBillingEntity46 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity46> all = repo.findAll();
        for(EnterpriseBillingEntity46 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
