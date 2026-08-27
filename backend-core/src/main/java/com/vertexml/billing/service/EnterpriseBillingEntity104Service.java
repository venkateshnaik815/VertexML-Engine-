package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity104;
import com.vertexml.billing.repo.EnterpriseBillingEntity104Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity104Service {
    private final EnterpriseBillingEntity104Repository repo;
    public EnterpriseBillingEntity104Service(EnterpriseBillingEntity104Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity104> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity104 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity104 create(EnterpriseBillingEntity104 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity104 update(UUID id, EnterpriseBillingEntity104 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity104> all = repo.findAll();
        for(EnterpriseBillingEntity104 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
