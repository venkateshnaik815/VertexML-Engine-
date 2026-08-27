package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity48;
import com.vertexml.billing.repo.EnterpriseBillingEntity48Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity48Service {
    private final EnterpriseBillingEntity48Repository repo;
    public EnterpriseBillingEntity48Service(EnterpriseBillingEntity48Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity48> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity48 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity48 create(EnterpriseBillingEntity48 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity48 update(UUID id, EnterpriseBillingEntity48 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity48> all = repo.findAll();
        for(EnterpriseBillingEntity48 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
