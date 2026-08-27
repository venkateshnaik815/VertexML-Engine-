package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity86;
import com.vertexml.billing.repo.EnterpriseBillingEntity86Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity86Service {
    private final EnterpriseBillingEntity86Repository repo;
    public EnterpriseBillingEntity86Service(EnterpriseBillingEntity86Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity86> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity86 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity86 create(EnterpriseBillingEntity86 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity86 update(UUID id, EnterpriseBillingEntity86 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity86> all = repo.findAll();
        for(EnterpriseBillingEntity86 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
