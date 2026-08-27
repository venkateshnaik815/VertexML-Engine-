package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity4;
import com.vertexml.billing.repo.EnterpriseBillingEntity4Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity4Service {
    private final EnterpriseBillingEntity4Repository repo;
    public EnterpriseBillingEntity4Service(EnterpriseBillingEntity4Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity4> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity4 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity4 create(EnterpriseBillingEntity4 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity4 update(UUID id, EnterpriseBillingEntity4 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity4> all = repo.findAll();
        for(EnterpriseBillingEntity4 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
