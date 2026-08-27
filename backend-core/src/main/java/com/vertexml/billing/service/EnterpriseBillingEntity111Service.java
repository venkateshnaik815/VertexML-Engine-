package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity111;
import com.vertexml.billing.repo.EnterpriseBillingEntity111Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity111Service {
    private final EnterpriseBillingEntity111Repository repo;
    public EnterpriseBillingEntity111Service(EnterpriseBillingEntity111Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity111> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity111 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity111 create(EnterpriseBillingEntity111 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity111 update(UUID id, EnterpriseBillingEntity111 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity111> all = repo.findAll();
        for(EnterpriseBillingEntity111 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
