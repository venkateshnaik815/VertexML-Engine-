package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity37;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity37Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity37Service {
    private final EnterpriseAnalyticsEntity37Repository repo;
    public EnterpriseAnalyticsEntity37Service(EnterpriseAnalyticsEntity37Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity37> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity37 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity37 create(EnterpriseAnalyticsEntity37 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity37 update(UUID id, EnterpriseAnalyticsEntity37 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity37> all = repo.findAll();
        for(EnterpriseAnalyticsEntity37 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
