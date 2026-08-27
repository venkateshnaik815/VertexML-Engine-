package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity42;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity42Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity42Service {
    private final EnterpriseAnalyticsEntity42Repository repo;
    public EnterpriseAnalyticsEntity42Service(EnterpriseAnalyticsEntity42Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity42> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity42 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity42 create(EnterpriseAnalyticsEntity42 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity42 update(UUID id, EnterpriseAnalyticsEntity42 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity42> all = repo.findAll();
        for(EnterpriseAnalyticsEntity42 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
