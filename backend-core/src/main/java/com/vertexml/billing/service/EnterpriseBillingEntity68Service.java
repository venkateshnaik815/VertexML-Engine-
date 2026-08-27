package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity68;
import com.vertexml.billing.repo.EnterpriseBillingEntity68Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity68Service {
    private final EnterpriseBillingEntity68Repository repo;
    public EnterpriseBillingEntity68Service(EnterpriseBillingEntity68Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity68> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity68 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity68 create(EnterpriseBillingEntity68 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity68 update(UUID id, EnterpriseBillingEntity68 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity68> all = repo.findAll();
        for(EnterpriseBillingEntity68 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
