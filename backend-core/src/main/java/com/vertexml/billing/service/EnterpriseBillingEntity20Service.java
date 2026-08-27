package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity20;
import com.vertexml.billing.repo.EnterpriseBillingEntity20Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity20Service {
    private final EnterpriseBillingEntity20Repository repo;
    public EnterpriseBillingEntity20Service(EnterpriseBillingEntity20Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity20> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity20 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity20 create(EnterpriseBillingEntity20 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity20 update(UUID id, EnterpriseBillingEntity20 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity20> all = repo.findAll();
        for(EnterpriseBillingEntity20 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
