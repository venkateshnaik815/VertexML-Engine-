package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity30;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity30Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity30Service {
    private final EnterpriseAnalyticsEntity30Repository repo;
    public EnterpriseAnalyticsEntity30Service(EnterpriseAnalyticsEntity30Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity30> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity30 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity30 create(EnterpriseAnalyticsEntity30 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity30 update(UUID id, EnterpriseAnalyticsEntity30 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity30> all = repo.findAll();
        for(EnterpriseAnalyticsEntity30 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
