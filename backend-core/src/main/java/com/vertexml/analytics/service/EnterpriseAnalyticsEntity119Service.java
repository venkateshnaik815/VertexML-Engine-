package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity119;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity119Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity119Service {
    private final EnterpriseAnalyticsEntity119Repository repo;
    public EnterpriseAnalyticsEntity119Service(EnterpriseAnalyticsEntity119Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity119> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity119 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity119 create(EnterpriseAnalyticsEntity119 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity119 update(UUID id, EnterpriseAnalyticsEntity119 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity119> all = repo.findAll();
        for(EnterpriseAnalyticsEntity119 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
