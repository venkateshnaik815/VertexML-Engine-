package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity117;
import com.vertexml.billing.repo.EnterpriseBillingEntity117Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity117Service {
    private final EnterpriseBillingEntity117Repository repo;
    public EnterpriseBillingEntity117Service(EnterpriseBillingEntity117Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity117> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity117 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity117 create(EnterpriseBillingEntity117 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity117 update(UUID id, EnterpriseBillingEntity117 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity117> all = repo.findAll();
        for(EnterpriseBillingEntity117 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
