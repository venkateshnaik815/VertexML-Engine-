package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity126;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity126Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity126Service {
    private final EnterpriseAnalyticsEntity126Repository repo;
    public EnterpriseAnalyticsEntity126Service(EnterpriseAnalyticsEntity126Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity126> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity126 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity126 create(EnterpriseAnalyticsEntity126 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity126 update(UUID id, EnterpriseAnalyticsEntity126 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity126> all = repo.findAll();
        for(EnterpriseAnalyticsEntity126 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
