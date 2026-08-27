package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity135;
import com.vertexml.billing.repo.EnterpriseBillingEntity135Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity135Service {
    private final EnterpriseBillingEntity135Repository repo;
    public EnterpriseBillingEntity135Service(EnterpriseBillingEntity135Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity135> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity135 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity135 create(EnterpriseBillingEntity135 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity135 update(UUID id, EnterpriseBillingEntity135 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity135> all = repo.findAll();
        for(EnterpriseBillingEntity135 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
