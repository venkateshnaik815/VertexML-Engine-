package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity127;
import com.vertexml.billing.repo.EnterpriseBillingEntity127Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity127Service {
    private final EnterpriseBillingEntity127Repository repo;
    public EnterpriseBillingEntity127Service(EnterpriseBillingEntity127Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity127> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity127 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity127 create(EnterpriseBillingEntity127 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity127 update(UUID id, EnterpriseBillingEntity127 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity127> all = repo.findAll();
        for(EnterpriseBillingEntity127 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
