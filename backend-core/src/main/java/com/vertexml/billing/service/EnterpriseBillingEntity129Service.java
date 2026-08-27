package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity129;
import com.vertexml.billing.repo.EnterpriseBillingEntity129Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity129Service {
    private final EnterpriseBillingEntity129Repository repo;
    public EnterpriseBillingEntity129Service(EnterpriseBillingEntity129Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity129> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity129 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity129 create(EnterpriseBillingEntity129 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity129 update(UUID id, EnterpriseBillingEntity129 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity129> all = repo.findAll();
        for(EnterpriseBillingEntity129 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
