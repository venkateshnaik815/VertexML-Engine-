package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity125;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity125Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity125Service {
    private final EnterpriseAnalyticsEntity125Repository repo;
    public EnterpriseAnalyticsEntity125Service(EnterpriseAnalyticsEntity125Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity125> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity125 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity125 create(EnterpriseAnalyticsEntity125 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity125 update(UUID id, EnterpriseAnalyticsEntity125 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity125> all = repo.findAll();
        for(EnterpriseAnalyticsEntity125 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
