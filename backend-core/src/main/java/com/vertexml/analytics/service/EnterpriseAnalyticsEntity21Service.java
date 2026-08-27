package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity21;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity21Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity21Service {
    private final EnterpriseAnalyticsEntity21Repository repo;
    public EnterpriseAnalyticsEntity21Service(EnterpriseAnalyticsEntity21Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity21> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity21 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity21 create(EnterpriseAnalyticsEntity21 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity21 update(UUID id, EnterpriseAnalyticsEntity21 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity21> all = repo.findAll();
        for(EnterpriseAnalyticsEntity21 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
