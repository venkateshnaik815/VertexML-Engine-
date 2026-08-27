package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity64;
import com.vertexml.billing.repo.EnterpriseBillingEntity64Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity64Service {
    private final EnterpriseBillingEntity64Repository repo;
    public EnterpriseBillingEntity64Service(EnterpriseBillingEntity64Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity64> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity64 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity64 create(EnterpriseBillingEntity64 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity64 update(UUID id, EnterpriseBillingEntity64 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity64> all = repo.findAll();
        for(EnterpriseBillingEntity64 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
