package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity60;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity60Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity60Service {
    private final EnterpriseAnalyticsEntity60Repository repo;
    public EnterpriseAnalyticsEntity60Service(EnterpriseAnalyticsEntity60Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity60> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity60 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity60 create(EnterpriseAnalyticsEntity60 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity60 update(UUID id, EnterpriseAnalyticsEntity60 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity60> all = repo.findAll();
        for(EnterpriseAnalyticsEntity60 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
