package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity83;
import com.vertexml.billing.repo.EnterpriseBillingEntity83Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity83Service {
    private final EnterpriseBillingEntity83Repository repo;
    public EnterpriseBillingEntity83Service(EnterpriseBillingEntity83Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity83> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity83 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity83 create(EnterpriseBillingEntity83 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity83 update(UUID id, EnterpriseBillingEntity83 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity83> all = repo.findAll();
        for(EnterpriseBillingEntity83 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
