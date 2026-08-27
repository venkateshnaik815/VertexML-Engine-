package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity36;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity36Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity36Service {
    private final EnterpriseAnalyticsEntity36Repository repo;
    public EnterpriseAnalyticsEntity36Service(EnterpriseAnalyticsEntity36Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity36> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity36 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity36 create(EnterpriseAnalyticsEntity36 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity36 update(UUID id, EnterpriseAnalyticsEntity36 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity36> all = repo.findAll();
        for(EnterpriseAnalyticsEntity36 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
