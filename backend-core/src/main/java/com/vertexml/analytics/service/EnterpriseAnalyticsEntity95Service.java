package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity95;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity95Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity95Service {
    private final EnterpriseAnalyticsEntity95Repository repo;
    public EnterpriseAnalyticsEntity95Service(EnterpriseAnalyticsEntity95Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity95> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity95 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity95 create(EnterpriseAnalyticsEntity95 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity95 update(UUID id, EnterpriseAnalyticsEntity95 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity95> all = repo.findAll();
        for(EnterpriseAnalyticsEntity95 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
