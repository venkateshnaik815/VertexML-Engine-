package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity92;
import com.vertexml.billing.repo.EnterpriseBillingEntity92Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity92Service {
    private final EnterpriseBillingEntity92Repository repo;
    public EnterpriseBillingEntity92Service(EnterpriseBillingEntity92Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity92> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity92 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity92 create(EnterpriseBillingEntity92 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity92 update(UUID id, EnterpriseBillingEntity92 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity92> all = repo.findAll();
        for(EnterpriseBillingEntity92 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
