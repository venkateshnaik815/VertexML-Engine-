package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity73;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity73Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity73Service {
    private final EnterpriseAnalyticsEntity73Repository repo;
    public EnterpriseAnalyticsEntity73Service(EnterpriseAnalyticsEntity73Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity73> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity73 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity73 create(EnterpriseAnalyticsEntity73 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity73 update(UUID id, EnterpriseAnalyticsEntity73 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity73> all = repo.findAll();
        for(EnterpriseAnalyticsEntity73 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
