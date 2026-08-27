package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity76;
import com.vertexml.billing.repo.EnterpriseBillingEntity76Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity76Service {
    private final EnterpriseBillingEntity76Repository repo;
    public EnterpriseBillingEntity76Service(EnterpriseBillingEntity76Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity76> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity76 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity76 create(EnterpriseBillingEntity76 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity76 update(UUID id, EnterpriseBillingEntity76 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity76> all = repo.findAll();
        for(EnterpriseBillingEntity76 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
