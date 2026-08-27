package com.vertexml.billing.service;
import com.vertexml.billing.domain.EnterpriseBillingEntity134;
import com.vertexml.billing.repo.EnterpriseBillingEntity134Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseBillingEntity134Service {
    private final EnterpriseBillingEntity134Repository repo;
    public EnterpriseBillingEntity134Service(EnterpriseBillingEntity134Repository repo) { this.repo = repo; }
    
    public List<EnterpriseBillingEntity134> getAll() { return repo.findAll(); }
    public EnterpriseBillingEntity134 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseBillingEntity134 create(EnterpriseBillingEntity134 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseBillingEntity134 update(UUID id, EnterpriseBillingEntity134 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseBillingEntity134> all = repo.findAll();
        for(EnterpriseBillingEntity134 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
