package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity101;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity101Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity101Service {
    private final EnterpriseAnalyticsEntity101Repository repo;
    public EnterpriseAnalyticsEntity101Service(EnterpriseAnalyticsEntity101Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity101> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity101 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity101 create(EnterpriseAnalyticsEntity101 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity101 update(UUID id, EnterpriseAnalyticsEntity101 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity101> all = repo.findAll();
        for(EnterpriseAnalyticsEntity101 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
