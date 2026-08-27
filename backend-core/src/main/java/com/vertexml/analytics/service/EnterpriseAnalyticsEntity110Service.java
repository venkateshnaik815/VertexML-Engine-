package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity110;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity110Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity110Service {
    private final EnterpriseAnalyticsEntity110Repository repo;
    public EnterpriseAnalyticsEntity110Service(EnterpriseAnalyticsEntity110Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity110> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity110 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity110 create(EnterpriseAnalyticsEntity110 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity110 update(UUID id, EnterpriseAnalyticsEntity110 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity110> all = repo.findAll();
        for(EnterpriseAnalyticsEntity110 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
