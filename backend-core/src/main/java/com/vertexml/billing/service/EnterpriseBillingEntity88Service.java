package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity88;
import com.vertexml.billing.repo.EnterpriseBillingEntity88Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity88Service {
    private final EnterpriseBillingEntity88Repository repo;
    public EnterpriseBillingEntity88Service(EnterpriseBillingEntity88Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity88> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity88 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity88 create(EnterpriseBillingEntity88 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity88 update(UUID id, EnterpriseBillingEntity88 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity88> all = repo.findAll();
        for(EnterpriseBillingEntity88 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
