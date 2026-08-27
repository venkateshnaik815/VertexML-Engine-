package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity106;
import com.vertexml.billing.repo.EnterpriseBillingEntity106Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity106Service {
    private final EnterpriseBillingEntity106Repository repo;
    public EnterpriseBillingEntity106Service(EnterpriseBillingEntity106Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity106> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity106 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity106 create(EnterpriseBillingEntity106 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity106 update(UUID id, EnterpriseBillingEntity106 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity106> all = repo.findAll();
        for(EnterpriseBillingEntity106 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
