package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity2;
import com.vertexml.billing.repo.EnterpriseBillingEntity2Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity2Service {
    private final EnterpriseBillingEntity2Repository repo;
    public EnterpriseBillingEntity2Service(EnterpriseBillingEntity2Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity2> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity2 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity2 create(EnterpriseBillingEntity2 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity2 update(UUID id, EnterpriseBillingEntity2 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity2> all = repo.findAll();
        for(EnterpriseBillingEntity2 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
