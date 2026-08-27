package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity28;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity28Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity28Service {
    private final EnterpriseAnalyticsEntity28Repository repo;
    public EnterpriseAnalyticsEntity28Service(EnterpriseAnalyticsEntity28Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity28> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity28 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity28 create(EnterpriseAnalyticsEntity28 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity28 update(UUID id, EnterpriseAnalyticsEntity28 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity28> all = repo.findAll();
        for(EnterpriseAnalyticsEntity28 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
