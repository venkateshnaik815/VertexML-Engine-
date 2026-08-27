package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity27;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity27Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity27Service {
    private final EnterpriseAnalyticsEntity27Repository repo;
    public EnterpriseAnalyticsEntity27Service(EnterpriseAnalyticsEntity27Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity27> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity27 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity27 create(EnterpriseAnalyticsEntity27 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity27 update(UUID id, EnterpriseAnalyticsEntity27 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity27> all = repo.findAll();
        for(EnterpriseAnalyticsEntity27 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
