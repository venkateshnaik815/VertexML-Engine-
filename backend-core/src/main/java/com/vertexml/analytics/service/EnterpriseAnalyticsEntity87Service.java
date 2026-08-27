package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity87;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity87Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity87Service {
    private final EnterpriseAnalyticsEntity87Repository repo;
    public EnterpriseAnalyticsEntity87Service(EnterpriseAnalyticsEntity87Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity87> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity87 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity87 create(EnterpriseAnalyticsEntity87 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity87 update(UUID id, EnterpriseAnalyticsEntity87 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity87> all = repo.findAll();
        for(EnterpriseAnalyticsEntity87 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
