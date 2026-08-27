package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity1;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity1Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity1Service {
    private final EnterpriseAnalyticsEntity1Repository repo;
    public EnterpriseAnalyticsEntity1Service(EnterpriseAnalyticsEntity1Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity1> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity1 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity1 create(EnterpriseAnalyticsEntity1 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity1 update(UUID id, EnterpriseAnalyticsEntity1 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity1> all = repo.findAll();
        for(EnterpriseAnalyticsEntity1 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
