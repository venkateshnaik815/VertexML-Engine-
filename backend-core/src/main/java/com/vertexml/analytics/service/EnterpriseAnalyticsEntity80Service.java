package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity80;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity80Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity80Service {
    private final EnterpriseAnalyticsEntity80Repository repo;
    public EnterpriseAnalyticsEntity80Service(EnterpriseAnalyticsEntity80Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity80> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity80 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity80 create(EnterpriseAnalyticsEntity80 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity80 update(UUID id, EnterpriseAnalyticsEntity80 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity80> all = repo.findAll();
        for(EnterpriseAnalyticsEntity80 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
