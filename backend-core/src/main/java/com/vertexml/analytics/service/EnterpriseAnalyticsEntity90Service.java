package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity90;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity90Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity90Service {
    private final EnterpriseAnalyticsEntity90Repository repo;
    public EnterpriseAnalyticsEntity90Service(EnterpriseAnalyticsEntity90Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity90> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity90 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity90 create(EnterpriseAnalyticsEntity90 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity90 update(UUID id, EnterpriseAnalyticsEntity90 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity90> all = repo.findAll();
        for(EnterpriseAnalyticsEntity90 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
