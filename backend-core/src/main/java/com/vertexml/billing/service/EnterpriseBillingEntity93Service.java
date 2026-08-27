package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity93;
import com.vertexml.billing.repo.EnterpriseBillingEntity93Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity93Service {
    private final EnterpriseBillingEntity93Repository repo;
    public EnterpriseBillingEntity93Service(EnterpriseBillingEntity93Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity93> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity93 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity93 create(EnterpriseBillingEntity93 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity93 update(UUID id, EnterpriseBillingEntity93 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity93> all = repo.findAll();
        for(EnterpriseBillingEntity93 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
