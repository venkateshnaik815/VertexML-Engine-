package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity18;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity18Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity18Service {
    private final EnterpriseAnalyticsEntity18Repository repo;
    public EnterpriseAnalyticsEntity18Service(EnterpriseAnalyticsEntity18Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity18> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity18 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity18 create(EnterpriseAnalyticsEntity18 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity18 update(UUID id, EnterpriseAnalyticsEntity18 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity18> all = repo.findAll();
        for(EnterpriseAnalyticsEntity18 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
