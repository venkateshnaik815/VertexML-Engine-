package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity31;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity31Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity31Service {
    private final EnterpriseAnalyticsEntity31Repository repo;
    public EnterpriseAnalyticsEntity31Service(EnterpriseAnalyticsEntity31Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity31> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity31 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity31 create(EnterpriseAnalyticsEntity31 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity31 update(UUID id, EnterpriseAnalyticsEntity31 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity31> all = repo.findAll();
        for(EnterpriseAnalyticsEntity31 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
