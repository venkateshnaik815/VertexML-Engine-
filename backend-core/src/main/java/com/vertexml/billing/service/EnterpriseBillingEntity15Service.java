package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity15;
import com.vertexml.billing.repo.EnterpriseBillingEntity15Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity15Service {
    private final EnterpriseBillingEntity15Repository repo;
    public EnterpriseBillingEntity15Service(EnterpriseBillingEntity15Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity15> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity15 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity15 create(EnterpriseBillingEntity15 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity15 update(UUID id, EnterpriseBillingEntity15 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity15> all = repo.findAll();
        for(EnterpriseBillingEntity15 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
