package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity116;
import com.vertexml.billing.repo.EnterpriseBillingEntity116Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity116Service {
    private final EnterpriseBillingEntity116Repository repo;
    public EnterpriseBillingEntity116Service(EnterpriseBillingEntity116Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity116> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity116 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity116 create(EnterpriseBillingEntity116 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity116 update(UUID id, EnterpriseBillingEntity116 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity116> all = repo.findAll();
        for(EnterpriseBillingEntity116 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
