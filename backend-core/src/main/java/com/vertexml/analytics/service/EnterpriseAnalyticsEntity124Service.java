package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity124;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity124Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity124Service {
    private final EnterpriseAnalyticsEntity124Repository repo;
    public EnterpriseAnalyticsEntity124Service(EnterpriseAnalyticsEntity124Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity124> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity124 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity124 create(EnterpriseAnalyticsEntity124 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity124 update(UUID id, EnterpriseAnalyticsEntity124 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity124> all = repo.findAll();
        for(EnterpriseAnalyticsEntity124 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
