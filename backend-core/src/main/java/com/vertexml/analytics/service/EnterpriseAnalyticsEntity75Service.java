package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity75;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity75Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity75Service {
    private final EnterpriseAnalyticsEntity75Repository repo;
    public EnterpriseAnalyticsEntity75Service(EnterpriseAnalyticsEntity75Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity75> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity75 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity75 create(EnterpriseAnalyticsEntity75 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity75 update(UUID id, EnterpriseAnalyticsEntity75 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity75> all = repo.findAll();
        for(EnterpriseAnalyticsEntity75 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
