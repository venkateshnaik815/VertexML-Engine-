package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity67;
import com.vertexml.billing.repo.EnterpriseBillingEntity67Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity67Service {
    private final EnterpriseBillingEntity67Repository repo;
    public EnterpriseBillingEntity67Service(EnterpriseBillingEntity67Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity67> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity67 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity67 create(EnterpriseBillingEntity67 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity67 update(UUID id, EnterpriseBillingEntity67 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity67> all = repo.findAll();
        for(EnterpriseBillingEntity67 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
