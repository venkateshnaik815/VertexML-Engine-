package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity5;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity5Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity5Service {
    private final EnterpriseAnalyticsEntity5Repository repo;
    public EnterpriseAnalyticsEntity5Service(EnterpriseAnalyticsEntity5Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity5> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity5 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity5 create(EnterpriseAnalyticsEntity5 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity5 update(UUID id, EnterpriseAnalyticsEntity5 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity5> all = repo.findAll();
        for(EnterpriseAnalyticsEntity5 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
