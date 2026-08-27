package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity73;
import com.vertexml.billing.repo.EnterpriseBillingEntity73Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity73Service {
    private final EnterpriseBillingEntity73Repository repo;
    public EnterpriseBillingEntity73Service(EnterpriseBillingEntity73Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity73> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity73 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity73 create(EnterpriseBillingEntity73 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity73 update(UUID id, EnterpriseBillingEntity73 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity73> all = repo.findAll();
        for(EnterpriseBillingEntity73 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
