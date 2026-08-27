package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity85;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity85Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity85Service {
    private final EnterpriseAnalyticsEntity85Repository repo;
    public EnterpriseAnalyticsEntity85Service(EnterpriseAnalyticsEntity85Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity85> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity85 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity85 create(EnterpriseAnalyticsEntity85 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity85 update(UUID id, EnterpriseAnalyticsEntity85 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity85> all = repo.findAll();
        for(EnterpriseAnalyticsEntity85 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
