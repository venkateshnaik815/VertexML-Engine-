package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity17;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity17Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity17Service {
    private final EnterpriseAnalyticsEntity17Repository repo;
    public EnterpriseAnalyticsEntity17Service(EnterpriseAnalyticsEntity17Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity17> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity17 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity17 create(EnterpriseAnalyticsEntity17 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity17 update(UUID id, EnterpriseAnalyticsEntity17 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity17> all = repo.findAll();
        for(EnterpriseAnalyticsEntity17 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
