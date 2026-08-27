package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity2;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity2Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity2Service {
    private final EnterpriseAnalyticsEntity2Repository repo;
    public EnterpriseAnalyticsEntity2Service(EnterpriseAnalyticsEntity2Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity2> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity2 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity2 create(EnterpriseAnalyticsEntity2 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity2 update(UUID id, EnterpriseAnalyticsEntity2 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity2> all = repo.findAll();
        for(EnterpriseAnalyticsEntity2 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
