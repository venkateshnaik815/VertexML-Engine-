package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity4;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity4Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity4Service {
    private final EnterpriseAnalyticsEntity4Repository repo;
    public EnterpriseAnalyticsEntity4Service(EnterpriseAnalyticsEntity4Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity4> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity4 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity4 create(EnterpriseAnalyticsEntity4 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity4 update(UUID id, EnterpriseAnalyticsEntity4 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity4> all = repo.findAll();
        for(EnterpriseAnalyticsEntity4 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
