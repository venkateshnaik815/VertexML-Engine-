package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity102;
import com.vertexml.billing.repo.EnterpriseBillingEntity102Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity102Service {
    private final EnterpriseBillingEntity102Repository repo;
    public EnterpriseBillingEntity102Service(EnterpriseBillingEntity102Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity102> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity102 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity102 create(EnterpriseBillingEntity102 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity102 update(UUID id, EnterpriseBillingEntity102 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity102> all = repo.findAll();
        for(EnterpriseBillingEntity102 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
