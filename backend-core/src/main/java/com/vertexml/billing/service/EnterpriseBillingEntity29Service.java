package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity29;
import com.vertexml.billing.repo.EnterpriseBillingEntity29Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity29Service {
    private final EnterpriseBillingEntity29Repository repo;
    public EnterpriseBillingEntity29Service(EnterpriseBillingEntity29Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity29> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity29 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity29 create(EnterpriseBillingEntity29 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity29 update(UUID id, EnterpriseBillingEntity29 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity29> all = repo.findAll();
        for(EnterpriseBillingEntity29 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
