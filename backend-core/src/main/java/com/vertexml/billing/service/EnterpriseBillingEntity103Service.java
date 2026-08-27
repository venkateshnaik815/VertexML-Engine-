package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity103;
import com.vertexml.billing.repo.EnterpriseBillingEntity103Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity103Service {
    private final EnterpriseBillingEntity103Repository repo;
    public EnterpriseBillingEntity103Service(EnterpriseBillingEntity103Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity103> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity103 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity103 create(EnterpriseBillingEntity103 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity103 update(UUID id, EnterpriseBillingEntity103 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity103> all = repo.findAll();
        for(EnterpriseBillingEntity103 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
