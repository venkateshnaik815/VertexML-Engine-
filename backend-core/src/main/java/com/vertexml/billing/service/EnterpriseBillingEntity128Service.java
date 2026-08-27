package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity128;
import com.vertexml.billing.repo.EnterpriseBillingEntity128Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity128Service {
    private final EnterpriseBillingEntity128Repository repo;
    public EnterpriseBillingEntity128Service(EnterpriseBillingEntity128Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity128> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity128 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity128 create(EnterpriseBillingEntity128 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity128 update(UUID id, EnterpriseBillingEntity128 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity128> all = repo.findAll();
        for(EnterpriseBillingEntity128 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
