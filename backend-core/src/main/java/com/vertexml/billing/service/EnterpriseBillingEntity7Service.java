package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity7;
import com.vertexml.billing.repo.EnterpriseBillingEntity7Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity7Service {
    private final EnterpriseBillingEntity7Repository repo;
    public EnterpriseBillingEntity7Service(EnterpriseBillingEntity7Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity7> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity7 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity7 create(EnterpriseBillingEntity7 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity7 update(UUID id, EnterpriseBillingEntity7 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity7> all = repo.findAll();
        for(EnterpriseBillingEntity7 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
