package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity128;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity128Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity128Service {
    private final EnterpriseAnalyticsEntity128Repository repo;
    public EnterpriseAnalyticsEntity128Service(EnterpriseAnalyticsEntity128Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity128> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity128 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity128 create(EnterpriseAnalyticsEntity128 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity128 update(UUID id, EnterpriseAnalyticsEntity128 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity128> all = repo.findAll();
        for(EnterpriseAnalyticsEntity128 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
