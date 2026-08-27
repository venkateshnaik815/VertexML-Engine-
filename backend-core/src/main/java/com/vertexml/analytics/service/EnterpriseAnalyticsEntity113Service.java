package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity113;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity113Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity113Service {
    private final EnterpriseAnalyticsEntity113Repository repo;
    public EnterpriseAnalyticsEntity113Service(EnterpriseAnalyticsEntity113Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity113> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity113 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity113 create(EnterpriseAnalyticsEntity113 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity113 update(UUID id, EnterpriseAnalyticsEntity113 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity113> all = repo.findAll();
        for(EnterpriseAnalyticsEntity113 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
