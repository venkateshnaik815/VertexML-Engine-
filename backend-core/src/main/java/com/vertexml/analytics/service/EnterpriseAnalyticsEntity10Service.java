package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity10;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity10Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity10Service {
    private final EnterpriseAnalyticsEntity10Repository repo;
    public EnterpriseAnalyticsEntity10Service(EnterpriseAnalyticsEntity10Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity10> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity10 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity10 create(EnterpriseAnalyticsEntity10 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity10 update(UUID id, EnterpriseAnalyticsEntity10 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity10> all = repo.findAll();
        for(EnterpriseAnalyticsEntity10 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
