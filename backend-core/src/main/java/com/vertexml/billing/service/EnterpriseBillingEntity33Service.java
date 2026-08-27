package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity33;
import com.vertexml.billing.repo.EnterpriseBillingEntity33Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity33Service {
    private final EnterpriseBillingEntity33Repository repo;
    public EnterpriseBillingEntity33Service(EnterpriseBillingEntity33Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity33> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity33 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity33 create(EnterpriseBillingEntity33 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity33 update(UUID id, EnterpriseBillingEntity33 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity33> all = repo.findAll();
        for(EnterpriseBillingEntity33 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
