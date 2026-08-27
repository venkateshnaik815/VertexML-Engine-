package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity115;
import com.vertexml.billing.repo.EnterpriseBillingEntity115Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity115Service {
    private final EnterpriseBillingEntity115Repository repo;
    public EnterpriseBillingEntity115Service(EnterpriseBillingEntity115Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity115> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity115 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity115 create(EnterpriseBillingEntity115 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity115 update(UUID id, EnterpriseBillingEntity115 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity115> all = repo.findAll();
        for(EnterpriseBillingEntity115 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
