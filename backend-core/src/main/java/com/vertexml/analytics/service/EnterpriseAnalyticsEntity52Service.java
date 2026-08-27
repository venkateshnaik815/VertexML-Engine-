package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity52;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity52Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity52Service {
    private final EnterpriseAnalyticsEntity52Repository repo;
    public EnterpriseAnalyticsEntity52Service(EnterpriseAnalyticsEntity52Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity52> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity52 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity52 create(EnterpriseAnalyticsEntity52 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity52 update(UUID id, EnterpriseAnalyticsEntity52 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity52> all = repo.findAll();
        for(EnterpriseAnalyticsEntity52 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
