package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity38;
import com.vertexml.billing.repo.EnterpriseBillingEntity38Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity38Service {
    private final EnterpriseBillingEntity38Repository repo;
    public EnterpriseBillingEntity38Service(EnterpriseBillingEntity38Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity38> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity38 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity38 create(EnterpriseBillingEntity38 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity38 update(UUID id, EnterpriseBillingEntity38 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity38> all = repo.findAll();
        for(EnterpriseBillingEntity38 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
