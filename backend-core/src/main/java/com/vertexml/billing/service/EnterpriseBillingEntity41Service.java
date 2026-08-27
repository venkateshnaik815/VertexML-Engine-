package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity41;
import com.vertexml.billing.repo.EnterpriseBillingEntity41Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity41Service {
    private final EnterpriseBillingEntity41Repository repo;
    public EnterpriseBillingEntity41Service(EnterpriseBillingEntity41Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity41> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity41 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity41 create(EnterpriseBillingEntity41 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity41 update(UUID id, EnterpriseBillingEntity41 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity41> all = repo.findAll();
        for(EnterpriseBillingEntity41 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
