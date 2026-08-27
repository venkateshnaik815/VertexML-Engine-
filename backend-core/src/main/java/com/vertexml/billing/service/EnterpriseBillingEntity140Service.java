package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity140;
import com.vertexml.billing.repo.EnterpriseBillingEntity140Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity140Service {
    private final EnterpriseBillingEntity140Repository repo;
    public EnterpriseBillingEntity140Service(EnterpriseBillingEntity140Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity140> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity140 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity140 create(EnterpriseBillingEntity140 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity140 update(UUID id, EnterpriseBillingEntity140 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity140> all = repo.findAll();
        for(EnterpriseBillingEntity140 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
