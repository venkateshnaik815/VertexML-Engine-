package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity19;
import com.vertexml.billing.repo.EnterpriseBillingEntity19Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity19Service {
    private final EnterpriseBillingEntity19Repository repo;
    public EnterpriseBillingEntity19Service(EnterpriseBillingEntity19Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity19> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity19 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity19 create(EnterpriseBillingEntity19 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity19 update(UUID id, EnterpriseBillingEntity19 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity19> all = repo.findAll();
        for(EnterpriseBillingEntity19 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
