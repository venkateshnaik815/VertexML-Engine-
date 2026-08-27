package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity109;
import com.vertexml.billing.repo.EnterpriseBillingEntity109Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity109Service {
    private final EnterpriseBillingEntity109Repository repo;
    public EnterpriseBillingEntity109Service(EnterpriseBillingEntity109Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity109> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity109 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity109 create(EnterpriseBillingEntity109 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity109 update(UUID id, EnterpriseBillingEntity109 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity109> all = repo.findAll();
        for(EnterpriseBillingEntity109 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
