package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity25;
import com.vertexml.billing.repo.EnterpriseBillingEntity25Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity25Service {
    private final EnterpriseBillingEntity25Repository repo;
    public EnterpriseBillingEntity25Service(EnterpriseBillingEntity25Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity25> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity25 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity25 create(EnterpriseBillingEntity25 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity25 update(UUID id, EnterpriseBillingEntity25 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity25> all = repo.findAll();
        for(EnterpriseBillingEntity25 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
