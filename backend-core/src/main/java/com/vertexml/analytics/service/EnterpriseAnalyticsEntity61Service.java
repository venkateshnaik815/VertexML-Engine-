package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity61;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity61Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity61Service {
    private final EnterpriseAnalyticsEntity61Repository repo;
    public EnterpriseAnalyticsEntity61Service(EnterpriseAnalyticsEntity61Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity61> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity61 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity61 create(EnterpriseAnalyticsEntity61 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity61 update(UUID id, EnterpriseAnalyticsEntity61 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity61> all = repo.findAll();
        for(EnterpriseAnalyticsEntity61 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
