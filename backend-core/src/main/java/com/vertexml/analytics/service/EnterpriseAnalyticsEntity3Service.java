package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity3;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity3Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity3Service {
    private final EnterpriseAnalyticsEntity3Repository repo;
    public EnterpriseAnalyticsEntity3Service(EnterpriseAnalyticsEntity3Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity3> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity3 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity3 create(EnterpriseAnalyticsEntity3 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity3 update(UUID id, EnterpriseAnalyticsEntity3 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity3> all = repo.findAll();
        for(EnterpriseAnalyticsEntity3 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
