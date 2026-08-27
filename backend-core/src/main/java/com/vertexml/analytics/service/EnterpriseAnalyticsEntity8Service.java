package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity8;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity8Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity8Service {
    private final EnterpriseAnalyticsEntity8Repository repo;
    public EnterpriseAnalyticsEntity8Service(EnterpriseAnalyticsEntity8Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity8> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity8 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity8 create(EnterpriseAnalyticsEntity8 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity8 update(UUID id, EnterpriseAnalyticsEntity8 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity8> all = repo.findAll();
        for(EnterpriseAnalyticsEntity8 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
