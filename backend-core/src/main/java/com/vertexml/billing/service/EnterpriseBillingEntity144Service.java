package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity144;
import com.vertexml.billing.repo.EnterpriseBillingEntity144Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity144Service {
    private final EnterpriseBillingEntity144Repository repo;
    public EnterpriseBillingEntity144Service(EnterpriseBillingEntity144Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity144> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity144 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity144 create(EnterpriseBillingEntity144 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity144 update(UUID id, EnterpriseBillingEntity144 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity144> all = repo.findAll();
        for(EnterpriseBillingEntity144 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
