package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity122;
import com.vertexml.billing.repo.EnterpriseBillingEntity122Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity122Service {
    private final EnterpriseBillingEntity122Repository repo;
    public EnterpriseBillingEntity122Service(EnterpriseBillingEntity122Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity122> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity122 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity122 create(EnterpriseBillingEntity122 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity122 update(UUID id, EnterpriseBillingEntity122 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity122> all = repo.findAll();
        for(EnterpriseBillingEntity122 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
