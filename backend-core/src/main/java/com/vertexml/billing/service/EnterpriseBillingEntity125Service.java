package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity125;
import com.vertexml.billing.repo.EnterpriseBillingEntity125Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity125Service {
    private final EnterpriseBillingEntity125Repository repo;
    public EnterpriseBillingEntity125Service(EnterpriseBillingEntity125Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity125> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity125 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity125 create(EnterpriseBillingEntity125 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity125 update(UUID id, EnterpriseBillingEntity125 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity125> all = repo.findAll();
        for(EnterpriseBillingEntity125 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
