package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity84;
import com.vertexml.billing.repo.EnterpriseBillingEntity84Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity84Service {
    private final EnterpriseBillingEntity84Repository repo;
    public EnterpriseBillingEntity84Service(EnterpriseBillingEntity84Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity84> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity84 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity84 create(EnterpriseBillingEntity84 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity84 update(UUID id, EnterpriseBillingEntity84 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity84> all = repo.findAll();
        for(EnterpriseBillingEntity84 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
