package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity7;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity7Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity7Service {
    private final EnterpriseAnalyticsEntity7Repository repo;
    public EnterpriseAnalyticsEntity7Service(EnterpriseAnalyticsEntity7Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity7> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity7 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity7 create(EnterpriseAnalyticsEntity7 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity7 update(UUID id, EnterpriseAnalyticsEntity7 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity7> all = repo.findAll();
        for(EnterpriseAnalyticsEntity7 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
