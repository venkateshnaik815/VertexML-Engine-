package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity35;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity35Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity35Service {
    private final EnterpriseAnalyticsEntity35Repository repo;
    public EnterpriseAnalyticsEntity35Service(EnterpriseAnalyticsEntity35Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity35> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity35 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity35 create(EnterpriseAnalyticsEntity35 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity35 update(UUID id, EnterpriseAnalyticsEntity35 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity35> all = repo.findAll();
        for(EnterpriseAnalyticsEntity35 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
