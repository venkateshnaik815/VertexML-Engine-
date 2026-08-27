package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity93;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity93Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity93Service {
    private final EnterpriseAnalyticsEntity93Repository repo;
    public EnterpriseAnalyticsEntity93Service(EnterpriseAnalyticsEntity93Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity93> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity93 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity93 create(EnterpriseAnalyticsEntity93 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity93 update(UUID id, EnterpriseAnalyticsEntity93 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity93> all = repo.findAll();
        for(EnterpriseAnalyticsEntity93 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
