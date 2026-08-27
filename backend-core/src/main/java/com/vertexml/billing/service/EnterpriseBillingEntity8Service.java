package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity8;
import com.vertexml.billing.repo.EnterpriseBillingEntity8Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity8Service {
    private final EnterpriseBillingEntity8Repository repo;
    public EnterpriseBillingEntity8Service(EnterpriseBillingEntity8Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity8> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity8 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity8 create(EnterpriseBillingEntity8 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity8 update(UUID id, EnterpriseBillingEntity8 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity8> all = repo.findAll();
        for(EnterpriseBillingEntity8 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
