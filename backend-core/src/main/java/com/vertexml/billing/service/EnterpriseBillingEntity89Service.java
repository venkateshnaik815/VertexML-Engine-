package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity89;
import com.vertexml.billing.repo.EnterpriseBillingEntity89Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity89Service {
    private final EnterpriseBillingEntity89Repository repo;
    public EnterpriseBillingEntity89Service(EnterpriseBillingEntity89Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity89> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity89 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity89 create(EnterpriseBillingEntity89 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity89 update(UUID id, EnterpriseBillingEntity89 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity89> all = repo.findAll();
        for(EnterpriseBillingEntity89 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
