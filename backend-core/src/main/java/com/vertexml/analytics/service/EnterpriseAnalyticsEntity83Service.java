package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity83;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity83Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity83Service {
    private final EnterpriseAnalyticsEntity83Repository repo;
    public EnterpriseAnalyticsEntity83Service(EnterpriseAnalyticsEntity83Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity83> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity83 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity83 create(EnterpriseAnalyticsEntity83 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity83 update(UUID id, EnterpriseAnalyticsEntity83 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity83> all = repo.findAll();
        for(EnterpriseAnalyticsEntity83 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
