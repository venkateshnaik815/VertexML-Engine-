package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity120;
import com.vertexml.billing.repo.EnterpriseBillingEntity120Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity120Service {
    private final EnterpriseBillingEntity120Repository repo;
    public EnterpriseBillingEntity120Service(EnterpriseBillingEntity120Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity120> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity120 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity120 create(EnterpriseBillingEntity120 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity120 update(UUID id, EnterpriseBillingEntity120 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity120> all = repo.findAll();
        for(EnterpriseBillingEntity120 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
