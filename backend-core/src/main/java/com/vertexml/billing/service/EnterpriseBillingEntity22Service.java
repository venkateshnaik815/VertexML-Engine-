package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity22;
import com.vertexml.billing.repo.EnterpriseBillingEntity22Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity22Service {
    private final EnterpriseBillingEntity22Repository repo;
    public EnterpriseBillingEntity22Service(EnterpriseBillingEntity22Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity22> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity22 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity22 create(EnterpriseBillingEntity22 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity22 update(UUID id, EnterpriseBillingEntity22 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity22> all = repo.findAll();
        for(EnterpriseBillingEntity22 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
