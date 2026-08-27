package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity149;
import com.vertexml.billing.repo.EnterpriseBillingEntity149Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity149Service {
    private final EnterpriseBillingEntity149Repository repo;
    public EnterpriseBillingEntity149Service(EnterpriseBillingEntity149Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity149> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity149 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity149 create(EnterpriseBillingEntity149 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity149 update(UUID id, EnterpriseBillingEntity149 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity149> all = repo.findAll();
        for(EnterpriseBillingEntity149 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
