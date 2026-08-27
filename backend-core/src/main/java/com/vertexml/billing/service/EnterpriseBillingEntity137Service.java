package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity137;
import com.vertexml.billing.repo.EnterpriseBillingEntity137Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity137Service {
    private final EnterpriseBillingEntity137Repository repo;
    public EnterpriseBillingEntity137Service(EnterpriseBillingEntity137Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity137> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity137 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity137 create(EnterpriseBillingEntity137 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity137 update(UUID id, EnterpriseBillingEntity137 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity137> all = repo.findAll();
        for(EnterpriseBillingEntity137 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
