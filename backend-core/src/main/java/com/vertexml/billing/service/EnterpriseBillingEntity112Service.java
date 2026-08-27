package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity112;
import com.vertexml.billing.repo.EnterpriseBillingEntity112Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity112Service {
    private final EnterpriseBillingEntity112Repository repo;
    public EnterpriseBillingEntity112Service(EnterpriseBillingEntity112Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity112> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity112 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity112 create(EnterpriseBillingEntity112 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity112 update(UUID id, EnterpriseBillingEntity112 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity112> all = repo.findAll();
        for(EnterpriseBillingEntity112 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
