package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity130;
import com.vertexml.billing.repo.EnterpriseBillingEntity130Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity130Service {
    private final EnterpriseBillingEntity130Repository repo;
    public EnterpriseBillingEntity130Service(EnterpriseBillingEntity130Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity130> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity130 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity130 create(EnterpriseBillingEntity130 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity130 update(UUID id, EnterpriseBillingEntity130 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity130> all = repo.findAll();
        for(EnterpriseBillingEntity130 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
