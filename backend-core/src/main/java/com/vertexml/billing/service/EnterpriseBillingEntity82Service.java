package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity82;
import com.vertexml.billing.repo.EnterpriseBillingEntity82Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity82Service {
    private final EnterpriseBillingEntity82Repository repo;
    public EnterpriseBillingEntity82Service(EnterpriseBillingEntity82Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity82> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity82 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity82 create(EnterpriseBillingEntity82 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity82 update(UUID id, EnterpriseBillingEntity82 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity82> all = repo.findAll();
        for(EnterpriseBillingEntity82 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
