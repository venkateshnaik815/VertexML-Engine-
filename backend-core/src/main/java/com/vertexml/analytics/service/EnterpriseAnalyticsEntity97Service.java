package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity97;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity97Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity97Service {
    private final EnterpriseAnalyticsEntity97Repository repo;
    public EnterpriseAnalyticsEntity97Service(EnterpriseAnalyticsEntity97Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity97> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity97 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity97 create(EnterpriseAnalyticsEntity97 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity97 update(UUID id, EnterpriseAnalyticsEntity97 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity97> all = repo.findAll();
        for(EnterpriseAnalyticsEntity97 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
