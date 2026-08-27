package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity1;
import com.vertexml.billing.repo.EnterpriseBillingEntity1Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity1Service {
    private final EnterpriseBillingEntity1Repository repo;
    public EnterpriseBillingEntity1Service(EnterpriseBillingEntity1Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity1> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity1 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity1 create(EnterpriseBillingEntity1 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity1 update(UUID id, EnterpriseBillingEntity1 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity1> all = repo.findAll();
        for(EnterpriseBillingEntity1 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
