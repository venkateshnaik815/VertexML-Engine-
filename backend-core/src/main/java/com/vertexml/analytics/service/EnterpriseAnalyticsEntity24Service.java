package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity24;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity24Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity24Service {
    private final EnterpriseAnalyticsEntity24Repository repo;
    public EnterpriseAnalyticsEntity24Service(EnterpriseAnalyticsEntity24Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity24> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity24 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity24 create(EnterpriseAnalyticsEntity24 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity24 update(UUID id, EnterpriseAnalyticsEntity24 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity24> all = repo.findAll();
        for(EnterpriseAnalyticsEntity24 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
