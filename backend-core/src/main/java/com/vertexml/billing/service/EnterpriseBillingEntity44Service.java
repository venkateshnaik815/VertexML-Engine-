package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity44;
import com.vertexml.billing.repo.EnterpriseBillingEntity44Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity44Service {
    private final EnterpriseBillingEntity44Repository repo;
    public EnterpriseBillingEntity44Service(EnterpriseBillingEntity44Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity44> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity44 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity44 create(EnterpriseBillingEntity44 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity44 update(UUID id, EnterpriseBillingEntity44 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity44> all = repo.findAll();
        for(EnterpriseBillingEntity44 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
