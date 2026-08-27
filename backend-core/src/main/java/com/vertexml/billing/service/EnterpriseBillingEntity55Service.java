package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity55;
import com.vertexml.billing.repo.EnterpriseBillingEntity55Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity55Service {
    private final EnterpriseBillingEntity55Repository repo;
    public EnterpriseBillingEntity55Service(EnterpriseBillingEntity55Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity55> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity55 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity55 create(EnterpriseBillingEntity55 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity55 update(UUID id, EnterpriseBillingEntity55 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity55> all = repo.findAll();
        for(EnterpriseBillingEntity55 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
