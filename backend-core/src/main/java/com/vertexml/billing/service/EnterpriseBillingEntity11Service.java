package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity11;
import com.vertexml.billing.repo.EnterpriseBillingEntity11Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity11Service {
    private final EnterpriseBillingEntity11Repository repo;
    public EnterpriseBillingEntity11Service(EnterpriseBillingEntity11Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity11> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity11 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity11 create(EnterpriseBillingEntity11 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity11 update(UUID id, EnterpriseBillingEntity11 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity11> all = repo.findAll();
        for(EnterpriseBillingEntity11 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
