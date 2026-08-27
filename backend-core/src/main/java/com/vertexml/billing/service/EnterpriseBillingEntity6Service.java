package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity6;
import com.vertexml.billing.repo.EnterpriseBillingEntity6Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity6Service {
    private final EnterpriseBillingEntity6Repository repo;
    public EnterpriseBillingEntity6Service(EnterpriseBillingEntity6Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity6> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity6 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity6 create(EnterpriseBillingEntity6 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity6 update(UUID id, EnterpriseBillingEntity6 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity6> all = repo.findAll();
        for(EnterpriseBillingEntity6 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
