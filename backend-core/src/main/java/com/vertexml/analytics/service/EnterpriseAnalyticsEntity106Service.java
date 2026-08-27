package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity106;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity106Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity106Service {
    private final EnterpriseAnalyticsEntity106Repository repo;
    public EnterpriseAnalyticsEntity106Service(EnterpriseAnalyticsEntity106Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity106> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity106 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity106 create(EnterpriseAnalyticsEntity106 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity106 update(UUID id, EnterpriseAnalyticsEntity106 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity106> all = repo.findAll();
        for(EnterpriseAnalyticsEntity106 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
