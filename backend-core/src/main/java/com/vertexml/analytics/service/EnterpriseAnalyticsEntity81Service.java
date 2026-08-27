package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity81;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity81Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity81Service {
    private final EnterpriseAnalyticsEntity81Repository repo;
    public EnterpriseAnalyticsEntity81Service(EnterpriseAnalyticsEntity81Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity81> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity81 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity81 create(EnterpriseAnalyticsEntity81 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity81 update(UUID id, EnterpriseAnalyticsEntity81 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity81> all = repo.findAll();
        for(EnterpriseAnalyticsEntity81 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
