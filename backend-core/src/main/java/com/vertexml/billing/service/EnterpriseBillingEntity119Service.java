package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity119;
import com.vertexml.billing.repo.EnterpriseBillingEntity119Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity119Service {
    private final EnterpriseBillingEntity119Repository repo;
    public EnterpriseBillingEntity119Service(EnterpriseBillingEntity119Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity119> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity119 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity119 create(EnterpriseBillingEntity119 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity119 update(UUID id, EnterpriseBillingEntity119 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity119> all = repo.findAll();
        for(EnterpriseBillingEntity119 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
