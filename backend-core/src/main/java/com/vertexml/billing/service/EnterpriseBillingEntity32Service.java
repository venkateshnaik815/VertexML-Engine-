package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity32;
import com.vertexml.billing.repo.EnterpriseBillingEntity32Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity32Service {
    private final EnterpriseBillingEntity32Repository repo;
    public EnterpriseBillingEntity32Service(EnterpriseBillingEntity32Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity32> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity32 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity32 create(EnterpriseBillingEntity32 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity32 update(UUID id, EnterpriseBillingEntity32 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity32> all = repo.findAll();
        for(EnterpriseBillingEntity32 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
