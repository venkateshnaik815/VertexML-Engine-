package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity62;
import com.vertexml.billing.repo.EnterpriseBillingEntity62Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity62Service {
    private final EnterpriseBillingEntity62Repository repo;
    public EnterpriseBillingEntity62Service(EnterpriseBillingEntity62Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity62> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity62 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity62 create(EnterpriseBillingEntity62 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity62 update(UUID id, EnterpriseBillingEntity62 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity62> all = repo.findAll();
        for(EnterpriseBillingEntity62 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
