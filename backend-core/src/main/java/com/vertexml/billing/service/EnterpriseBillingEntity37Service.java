package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity37;
import com.vertexml.billing.repo.EnterpriseBillingEntity37Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity37Service {
    private final EnterpriseBillingEntity37Repository repo;
    public EnterpriseBillingEntity37Service(EnterpriseBillingEntity37Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity37> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity37 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity37 create(EnterpriseBillingEntity37 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity37 update(UUID id, EnterpriseBillingEntity37 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity37> all = repo.findAll();
        for(EnterpriseBillingEntity37 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
