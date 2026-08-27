package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity30;
import com.vertexml.billing.repo.EnterpriseBillingEntity30Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity30Service {
    private final EnterpriseBillingEntity30Repository repo;
    public EnterpriseBillingEntity30Service(EnterpriseBillingEntity30Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity30> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity30 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity30 create(EnterpriseBillingEntity30 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity30 update(UUID id, EnterpriseBillingEntity30 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity30> all = repo.findAll();
        for(EnterpriseBillingEntity30 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
