package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity118;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity118Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity118Service {
    private final EnterpriseAnalyticsEntity118Repository repo;
    public EnterpriseAnalyticsEntity118Service(EnterpriseAnalyticsEntity118Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity118> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity118 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity118 create(EnterpriseAnalyticsEntity118 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity118 update(UUID id, EnterpriseAnalyticsEntity118 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity118> all = repo.findAll();
        for(EnterpriseAnalyticsEntity118 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
