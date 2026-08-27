package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity70;
import com.vertexml.billing.repo.EnterpriseBillingEntity70Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity70Service {
    private final EnterpriseBillingEntity70Repository repo;
    public EnterpriseBillingEntity70Service(EnterpriseBillingEntity70Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity70> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity70 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity70 create(EnterpriseBillingEntity70 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity70 update(UUID id, EnterpriseBillingEntity70 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity70> all = repo.findAll();
        for(EnterpriseBillingEntity70 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
