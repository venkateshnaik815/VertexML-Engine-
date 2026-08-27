package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity132;
import com.vertexml.billing.repo.EnterpriseBillingEntity132Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity132Service {
    private final EnterpriseBillingEntity132Repository repo;
    public EnterpriseBillingEntity132Service(EnterpriseBillingEntity132Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity132> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity132 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity132 create(EnterpriseBillingEntity132 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity132 update(UUID id, EnterpriseBillingEntity132 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity132> all = repo.findAll();
        for(EnterpriseBillingEntity132 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
