package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity98;
import com.vertexml.billing.repo.EnterpriseBillingEntity98Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity98Service {
    private final EnterpriseBillingEntity98Repository repo;
    public EnterpriseBillingEntity98Service(EnterpriseBillingEntity98Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity98> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity98 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity98 create(EnterpriseBillingEntity98 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity98 update(UUID id, EnterpriseBillingEntity98 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity98> all = repo.findAll();
        for(EnterpriseBillingEntity98 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
