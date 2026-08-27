package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity26;
import com.vertexml.billing.repo.EnterpriseBillingEntity26Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity26Service {
    private final EnterpriseBillingEntity26Repository repo;
    public EnterpriseBillingEntity26Service(EnterpriseBillingEntity26Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity26> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity26 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity26 create(EnterpriseBillingEntity26 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity26 update(UUID id, EnterpriseBillingEntity26 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity26> all = repo.findAll();
        for(EnterpriseBillingEntity26 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
