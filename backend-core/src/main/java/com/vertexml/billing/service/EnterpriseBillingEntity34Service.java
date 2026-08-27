package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity34;
import com.vertexml.billing.repo.EnterpriseBillingEntity34Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity34Service {
    private final EnterpriseBillingEntity34Repository repo;
    public EnterpriseBillingEntity34Service(EnterpriseBillingEntity34Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity34> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity34 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity34 create(EnterpriseBillingEntity34 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity34 update(UUID id, EnterpriseBillingEntity34 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity34> all = repo.findAll();
        for(EnterpriseBillingEntity34 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
