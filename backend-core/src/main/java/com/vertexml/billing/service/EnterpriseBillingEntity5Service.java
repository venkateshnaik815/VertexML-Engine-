package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity5;
import com.vertexml.billing.repo.EnterpriseBillingEntity5Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity5Service {
    private final EnterpriseBillingEntity5Repository repo;
    public EnterpriseBillingEntity5Service(EnterpriseBillingEntity5Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity5> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity5 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity5 create(EnterpriseBillingEntity5 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity5 update(UUID id, EnterpriseBillingEntity5 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity5> all = repo.findAll();
        for(EnterpriseBillingEntity5 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
