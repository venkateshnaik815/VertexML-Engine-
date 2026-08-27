package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity133;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity133Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity133Service {
    private final EnterpriseAnalyticsEntity133Repository repo;
    public EnterpriseAnalyticsEntity133Service(EnterpriseAnalyticsEntity133Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity133> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity133 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity133 create(EnterpriseAnalyticsEntity133 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity133 update(UUID id, EnterpriseAnalyticsEntity133 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity133> all = repo.findAll();
        for(EnterpriseAnalyticsEntity133 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
