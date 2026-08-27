package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity118;
import com.vertexml.billing.repo.EnterpriseBillingEntity118Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity118Service {
    private final EnterpriseBillingEntity118Repository repo;
    public EnterpriseBillingEntity118Service(EnterpriseBillingEntity118Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity118> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity118 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity118 create(EnterpriseBillingEntity118 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity118 update(UUID id, EnterpriseBillingEntity118 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity118> all = repo.findAll();
        for(EnterpriseBillingEntity118 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
