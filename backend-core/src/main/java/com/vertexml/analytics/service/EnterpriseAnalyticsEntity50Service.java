package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity50;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity50Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity50Service {
    private final EnterpriseAnalyticsEntity50Repository repo;
    public EnterpriseAnalyticsEntity50Service(EnterpriseAnalyticsEntity50Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity50> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity50 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity50 create(EnterpriseAnalyticsEntity50 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity50 update(UUID id, EnterpriseAnalyticsEntity50 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity50> all = repo.findAll();
        for(EnterpriseAnalyticsEntity50 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
