package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity63;
import com.vertexml.billing.repo.EnterpriseBillingEntity63Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity63Service {
    private final EnterpriseBillingEntity63Repository repo;
    public EnterpriseBillingEntity63Service(EnterpriseBillingEntity63Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity63> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity63 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity63 create(EnterpriseBillingEntity63 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity63 update(UUID id, EnterpriseBillingEntity63 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity63> all = repo.findAll();
        for(EnterpriseBillingEntity63 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
