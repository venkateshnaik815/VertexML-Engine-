package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity72;
import com.vertexml.billing.repo.EnterpriseBillingEntity72Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity72Service {
    private final EnterpriseBillingEntity72Repository repo;
    public EnterpriseBillingEntity72Service(EnterpriseBillingEntity72Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity72> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity72 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity72 create(EnterpriseBillingEntity72 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity72 update(UUID id, EnterpriseBillingEntity72 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity72> all = repo.findAll();
        for(EnterpriseBillingEntity72 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
