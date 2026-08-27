package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity141;
import com.vertexml.billing.repo.EnterpriseBillingEntity141Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity141Service {
    private final EnterpriseBillingEntity141Repository repo;
    public EnterpriseBillingEntity141Service(EnterpriseBillingEntity141Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity141> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity141 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity141 create(EnterpriseBillingEntity141 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity141 update(UUID id, EnterpriseBillingEntity141 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity141> all = repo.findAll();
        for(EnterpriseBillingEntity141 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
