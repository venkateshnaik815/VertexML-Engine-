package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity107;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity107Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity107Service {
    private final EnterpriseAnalyticsEntity107Repository repo;
    public EnterpriseAnalyticsEntity107Service(EnterpriseAnalyticsEntity107Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity107> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity107 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity107 create(EnterpriseAnalyticsEntity107 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity107 update(UUID id, EnterpriseAnalyticsEntity107 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity107> all = repo.findAll();
        for(EnterpriseAnalyticsEntity107 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
