package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity39;
import com.vertexml.billing.repo.EnterpriseBillingEntity39Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity39Service {
    private final EnterpriseBillingEntity39Repository repo;
    public EnterpriseBillingEntity39Service(EnterpriseBillingEntity39Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity39> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity39 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity39 create(EnterpriseBillingEntity39 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity39 update(UUID id, EnterpriseBillingEntity39 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity39> all = repo.findAll();
        for(EnterpriseBillingEntity39 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
