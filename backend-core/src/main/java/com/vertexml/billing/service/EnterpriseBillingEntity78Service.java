package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity78;
import com.vertexml.billing.repo.EnterpriseBillingEntity78Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity78Service {
    private final EnterpriseBillingEntity78Repository repo;
    public EnterpriseBillingEntity78Service(EnterpriseBillingEntity78Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity78> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity78 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity78 create(EnterpriseBillingEntity78 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity78 update(UUID id, EnterpriseBillingEntity78 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity78> all = repo.findAll();
        for(EnterpriseBillingEntity78 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
