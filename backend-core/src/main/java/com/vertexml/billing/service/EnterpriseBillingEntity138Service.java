package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity138;
import com.vertexml.billing.repo.EnterpriseBillingEntity138Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity138Service {
    private final EnterpriseBillingEntity138Repository repo;
    public EnterpriseBillingEntity138Service(EnterpriseBillingEntity138Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity138> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity138 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity138 create(EnterpriseBillingEntity138 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity138 update(UUID id, EnterpriseBillingEntity138 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity138> all = repo.findAll();
        for(EnterpriseBillingEntity138 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
