package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity13;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity13Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity13Service {
    private final EnterpriseAnalyticsEntity13Repository repo;
    public EnterpriseAnalyticsEntity13Service(EnterpriseAnalyticsEntity13Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity13> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity13 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity13 create(EnterpriseAnalyticsEntity13 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity13 update(UUID id, EnterpriseAnalyticsEntity13 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity13> all = repo.findAll();
        for(EnterpriseAnalyticsEntity13 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
