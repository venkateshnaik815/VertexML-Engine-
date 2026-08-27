package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity29;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity29Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity29Service {
    private final EnterpriseAnalyticsEntity29Repository repo;
    public EnterpriseAnalyticsEntity29Service(EnterpriseAnalyticsEntity29Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity29> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity29 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity29 create(EnterpriseAnalyticsEntity29 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity29 update(UUID id, EnterpriseAnalyticsEntity29 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity29> all = repo.findAll();
        for(EnterpriseAnalyticsEntity29 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
