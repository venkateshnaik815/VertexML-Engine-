package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity25;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity25Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity25Service {
    private final EnterpriseAnalyticsEntity25Repository repo;
    public EnterpriseAnalyticsEntity25Service(EnterpriseAnalyticsEntity25Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity25> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity25 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity25 create(EnterpriseAnalyticsEntity25 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity25 update(UUID id, EnterpriseAnalyticsEntity25 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity25> all = repo.findAll();
        for(EnterpriseAnalyticsEntity25 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
