package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity3;
import com.vertexml.billing.repo.EnterpriseBillingEntity3Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity3Service {
    private final EnterpriseBillingEntity3Repository repo;
    public EnterpriseBillingEntity3Service(EnterpriseBillingEntity3Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity3> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity3 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity3 create(EnterpriseBillingEntity3 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity3 update(UUID id, EnterpriseBillingEntity3 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity3> all = repo.findAll();
        for(EnterpriseBillingEntity3 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
