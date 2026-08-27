package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity58;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity58Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity58Service {
    private final EnterpriseAnalyticsEntity58Repository repo;
    public EnterpriseAnalyticsEntity58Service(EnterpriseAnalyticsEntity58Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity58> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity58 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity58 create(EnterpriseAnalyticsEntity58 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity58 update(UUID id, EnterpriseAnalyticsEntity58 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity58> all = repo.findAll();
        for(EnterpriseAnalyticsEntity58 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
