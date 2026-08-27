package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity38;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity38Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity38Service {
    private final EnterpriseAnalyticsEntity38Repository repo;
    public EnterpriseAnalyticsEntity38Service(EnterpriseAnalyticsEntity38Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity38> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity38 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity38 create(EnterpriseAnalyticsEntity38 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity38 update(UUID id, EnterpriseAnalyticsEntity38 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity38> all = repo.findAll();
        for(EnterpriseAnalyticsEntity38 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
