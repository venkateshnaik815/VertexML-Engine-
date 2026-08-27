package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity64;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity64Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity64Service {
    private final EnterpriseAnalyticsEntity64Repository repo;
    public EnterpriseAnalyticsEntity64Service(EnterpriseAnalyticsEntity64Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity64> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity64 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity64 create(EnterpriseAnalyticsEntity64 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity64 update(UUID id, EnterpriseAnalyticsEntity64 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity64> all = repo.findAll();
        for(EnterpriseAnalyticsEntity64 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
