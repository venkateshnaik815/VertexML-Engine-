package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity14;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity14Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity14Service {
    private final EnterpriseAnalyticsEntity14Repository repo;
    public EnterpriseAnalyticsEntity14Service(EnterpriseAnalyticsEntity14Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity14> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity14 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity14 create(EnterpriseAnalyticsEntity14 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity14 update(UUID id, EnterpriseAnalyticsEntity14 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity14> all = repo.findAll();
        for(EnterpriseAnalyticsEntity14 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
