package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity57;
import com.vertexml.billing.repo.EnterpriseBillingEntity57Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity57Service {
    private final EnterpriseBillingEntity57Repository repo;
    public EnterpriseBillingEntity57Service(EnterpriseBillingEntity57Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity57> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity57 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity57 create(EnterpriseBillingEntity57 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity57 update(UUID id, EnterpriseBillingEntity57 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity57> all = repo.findAll();
        for(EnterpriseBillingEntity57 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
