package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity12;
import com.vertexml.billing.repo.EnterpriseBillingEntity12Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity12Service {
    private final EnterpriseBillingEntity12Repository repo;
    public EnterpriseBillingEntity12Service(EnterpriseBillingEntity12Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity12> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity12 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity12 create(EnterpriseBillingEntity12 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity12 update(UUID id, EnterpriseBillingEntity12 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity12> all = repo.findAll();
        for(EnterpriseBillingEntity12 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
