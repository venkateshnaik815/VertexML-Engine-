package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity126;
import com.vertexml.billing.repo.EnterpriseBillingEntity126Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity126Service {
    private final EnterpriseBillingEntity126Repository repo;
    public EnterpriseBillingEntity126Service(EnterpriseBillingEntity126Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity126> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity126 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity126 create(EnterpriseBillingEntity126 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity126 update(UUID id, EnterpriseBillingEntity126 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity126> all = repo.findAll();
        for(EnterpriseBillingEntity126 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
