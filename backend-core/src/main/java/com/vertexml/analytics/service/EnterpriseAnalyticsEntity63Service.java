package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity63;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity63Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity63Service {
    private final EnterpriseAnalyticsEntity63Repository repo;
    public EnterpriseAnalyticsEntity63Service(EnterpriseAnalyticsEntity63Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity63> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity63 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity63 create(EnterpriseAnalyticsEntity63 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity63 update(UUID id, EnterpriseAnalyticsEntity63 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity63> all = repo.findAll();
        for(EnterpriseAnalyticsEntity63 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
