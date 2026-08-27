package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity16;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity16Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity16Service {
    private final EnterpriseAnalyticsEntity16Repository repo;
    public EnterpriseAnalyticsEntity16Service(EnterpriseAnalyticsEntity16Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity16> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity16 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity16 create(EnterpriseAnalyticsEntity16 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity16 update(UUID id, EnterpriseAnalyticsEntity16 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity16> all = repo.findAll();
        for(EnterpriseAnalyticsEntity16 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
