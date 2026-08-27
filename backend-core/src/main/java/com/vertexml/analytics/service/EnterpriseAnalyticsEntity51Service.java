package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity51;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity51Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity51Service {
    private final EnterpriseAnalyticsEntity51Repository repo;
    public EnterpriseAnalyticsEntity51Service(EnterpriseAnalyticsEntity51Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity51> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity51 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity51 create(EnterpriseAnalyticsEntity51 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity51 update(UUID id, EnterpriseAnalyticsEntity51 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity51> all = repo.findAll();
        for(EnterpriseAnalyticsEntity51 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
