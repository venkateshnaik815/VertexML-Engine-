package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity54;
import com.vertexml.billing.repo.EnterpriseBillingEntity54Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity54Service {
    private final EnterpriseBillingEntity54Repository repo;
    public EnterpriseBillingEntity54Service(EnterpriseBillingEntity54Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity54> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity54 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity54 create(EnterpriseBillingEntity54 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity54 update(UUID id, EnterpriseBillingEntity54 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity54> all = repo.findAll();
        for(EnterpriseBillingEntity54 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
