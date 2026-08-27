package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity115;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity115Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity115Service {
    private final EnterpriseAnalyticsEntity115Repository repo;
    public EnterpriseAnalyticsEntity115Service(EnterpriseAnalyticsEntity115Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity115> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity115 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity115 create(EnterpriseAnalyticsEntity115 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity115 update(UUID id, EnterpriseAnalyticsEntity115 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity115> all = repo.findAll();
        for(EnterpriseAnalyticsEntity115 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
