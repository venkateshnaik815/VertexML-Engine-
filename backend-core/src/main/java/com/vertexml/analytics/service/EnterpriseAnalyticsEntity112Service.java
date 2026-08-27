package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity112;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity112Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity112Service {
    private final EnterpriseAnalyticsEntity112Repository repo;
    public EnterpriseAnalyticsEntity112Service(EnterpriseAnalyticsEntity112Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity112> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity112 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity112 create(EnterpriseAnalyticsEntity112 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity112 update(UUID id, EnterpriseAnalyticsEntity112 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity112> all = repo.findAll();
        for(EnterpriseAnalyticsEntity112 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
