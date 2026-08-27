package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity105;
import com.vertexml.billing.repo.EnterpriseBillingEntity105Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity105Service {
    private final EnterpriseBillingEntity105Repository repo;
    public EnterpriseBillingEntity105Service(EnterpriseBillingEntity105Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity105> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity105 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity105 create(EnterpriseBillingEntity105 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity105 update(UUID id, EnterpriseBillingEntity105 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity105> all = repo.findAll();
        for(EnterpriseBillingEntity105 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
