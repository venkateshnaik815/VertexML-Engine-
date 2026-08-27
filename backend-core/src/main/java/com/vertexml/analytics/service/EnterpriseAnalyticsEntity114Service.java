package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity114;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity114Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity114Service {
    private final EnterpriseAnalyticsEntity114Repository repo;
    public EnterpriseAnalyticsEntity114Service(EnterpriseAnalyticsEntity114Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity114> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity114 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity114 create(EnterpriseAnalyticsEntity114 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity114 update(UUID id, EnterpriseAnalyticsEntity114 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity114> all = repo.findAll();
        for(EnterpriseAnalyticsEntity114 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
