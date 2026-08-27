package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity6;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity6Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity6Service {
    private final EnterpriseAnalyticsEntity6Repository repo;
    public EnterpriseAnalyticsEntity6Service(EnterpriseAnalyticsEntity6Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity6> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity6 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity6 create(EnterpriseAnalyticsEntity6 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity6 update(UUID id, EnterpriseAnalyticsEntity6 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity6> all = repo.findAll();
        for(EnterpriseAnalyticsEntity6 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
