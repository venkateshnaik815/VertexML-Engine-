package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity121;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity121Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity121Service {
    private final EnterpriseAnalyticsEntity121Repository repo;
    public EnterpriseAnalyticsEntity121Service(EnterpriseAnalyticsEntity121Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity121> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity121 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity121 create(EnterpriseAnalyticsEntity121 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity121 update(UUID id, EnterpriseAnalyticsEntity121 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity121> all = repo.findAll();
        for(EnterpriseAnalyticsEntity121 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
