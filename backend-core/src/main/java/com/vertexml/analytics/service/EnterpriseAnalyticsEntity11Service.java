package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity11;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity11Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity11Service {
    private final EnterpriseAnalyticsEntity11Repository repo;
    public EnterpriseAnalyticsEntity11Service(EnterpriseAnalyticsEntity11Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity11> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity11 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity11 create(EnterpriseAnalyticsEntity11 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity11 update(UUID id, EnterpriseAnalyticsEntity11 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity11> all = repo.findAll();
        for(EnterpriseAnalyticsEntity11 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
