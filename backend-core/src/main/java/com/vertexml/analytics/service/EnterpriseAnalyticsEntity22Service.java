package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity22;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity22Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity22Service {
    private final EnterpriseAnalyticsEntity22Repository repo;
    public EnterpriseAnalyticsEntity22Service(EnterpriseAnalyticsEntity22Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity22> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity22 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity22 create(EnterpriseAnalyticsEntity22 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity22 update(UUID id, EnterpriseAnalyticsEntity22 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity22> all = repo.findAll();
        for(EnterpriseAnalyticsEntity22 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
