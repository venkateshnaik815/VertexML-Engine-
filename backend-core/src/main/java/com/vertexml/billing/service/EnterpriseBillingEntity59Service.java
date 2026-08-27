package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity59;
import com.vertexml.billing.repo.EnterpriseBillingEntity59Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity59Service {
    private final EnterpriseBillingEntity59Repository repo;
    public EnterpriseBillingEntity59Service(EnterpriseBillingEntity59Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity59> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity59 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity59 create(EnterpriseBillingEntity59 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity59 update(UUID id, EnterpriseBillingEntity59 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity59> all = repo.findAll();
        for(EnterpriseBillingEntity59 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
