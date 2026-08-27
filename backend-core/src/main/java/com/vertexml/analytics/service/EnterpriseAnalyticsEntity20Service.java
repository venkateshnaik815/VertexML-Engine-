package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity20;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity20Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity20Service {
    private final EnterpriseAnalyticsEntity20Repository repo;
    public EnterpriseAnalyticsEntity20Service(EnterpriseAnalyticsEntity20Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity20> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity20 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity20 create(EnterpriseAnalyticsEntity20 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity20 update(UUID id, EnterpriseAnalyticsEntity20 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity20> all = repo.findAll();
        for(EnterpriseAnalyticsEntity20 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
