package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity71;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity71Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity71Service {
    private final EnterpriseAnalyticsEntity71Repository repo;
    public EnterpriseAnalyticsEntity71Service(EnterpriseAnalyticsEntity71Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity71> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity71 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity71 create(EnterpriseAnalyticsEntity71 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity71 update(UUID id, EnterpriseAnalyticsEntity71 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity71> all = repo.findAll();
        for(EnterpriseAnalyticsEntity71 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
