package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity21;
import com.vertexml.billing.repo.EnterpriseBillingEntity21Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity21Service {
    private final EnterpriseBillingEntity21Repository repo;
    public EnterpriseBillingEntity21Service(EnterpriseBillingEntity21Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity21> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity21 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity21 create(EnterpriseBillingEntity21 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity21 update(UUID id, EnterpriseBillingEntity21 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity21> all = repo.findAll();
        for(EnterpriseBillingEntity21 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
