package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity143;
import com.vertexml.billing.repo.EnterpriseBillingEntity143Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity143Service {
    private final EnterpriseBillingEntity143Repository repo;
    public EnterpriseBillingEntity143Service(EnterpriseBillingEntity143Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity143> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity143 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity143 create(EnterpriseBillingEntity143 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity143 update(UUID id, EnterpriseBillingEntity143 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity143> all = repo.findAll();
        for(EnterpriseBillingEntity143 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
