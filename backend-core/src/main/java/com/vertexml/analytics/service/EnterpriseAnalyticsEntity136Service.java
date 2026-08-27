package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity136;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity136Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity136Service {
    private final EnterpriseAnalyticsEntity136Repository repo;
    public EnterpriseAnalyticsEntity136Service(EnterpriseAnalyticsEntity136Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity136> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity136 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity136 create(EnterpriseAnalyticsEntity136 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity136 update(UUID id, EnterpriseAnalyticsEntity136 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity136> all = repo.findAll();
        for(EnterpriseAnalyticsEntity136 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
