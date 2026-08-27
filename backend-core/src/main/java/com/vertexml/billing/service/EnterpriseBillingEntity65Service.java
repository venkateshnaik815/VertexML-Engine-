package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity65;
import com.vertexml.billing.repo.EnterpriseBillingEntity65Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity65Service {
    private final EnterpriseBillingEntity65Repository repo;
    public EnterpriseBillingEntity65Service(EnterpriseBillingEntity65Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity65> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity65 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity65 create(EnterpriseBillingEntity65 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity65 update(UUID id, EnterpriseBillingEntity65 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity65> all = repo.findAll();
        for(EnterpriseBillingEntity65 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
