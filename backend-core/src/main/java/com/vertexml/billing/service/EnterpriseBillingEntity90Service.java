package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity90;
import com.vertexml.billing.repo.EnterpriseBillingEntity90Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity90Service {
    private final EnterpriseBillingEntity90Repository repo;
    public EnterpriseBillingEntity90Service(EnterpriseBillingEntity90Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity90> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity90 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity90 create(EnterpriseBillingEntity90 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity90 update(UUID id, EnterpriseBillingEntity90 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity90> all = repo.findAll();
        for(EnterpriseBillingEntity90 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
