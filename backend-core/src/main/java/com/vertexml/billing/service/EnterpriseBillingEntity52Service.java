package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity52;
import com.vertexml.billing.repo.EnterpriseBillingEntity52Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity52Service {
    private final EnterpriseBillingEntity52Repository repo;
    public EnterpriseBillingEntity52Service(EnterpriseBillingEntity52Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity52> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity52 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity52 create(EnterpriseBillingEntity52 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity52 update(UUID id, EnterpriseBillingEntity52 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity52> all = repo.findAll();
        for(EnterpriseBillingEntity52 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
