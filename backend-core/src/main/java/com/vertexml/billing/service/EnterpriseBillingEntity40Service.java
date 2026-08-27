package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity40;
import com.vertexml.billing.repo.EnterpriseBillingEntity40Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity40Service {
    private final EnterpriseBillingEntity40Repository repo;
    public EnterpriseBillingEntity40Service(EnterpriseBillingEntity40Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity40> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity40 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity40 create(EnterpriseBillingEntity40 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity40 update(UUID id, EnterpriseBillingEntity40 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity40> all = repo.findAll();
        for(EnterpriseBillingEntity40 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
