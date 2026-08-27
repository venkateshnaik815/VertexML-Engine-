package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity144;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity144Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity144Service {
    private final EnterpriseAnalyticsEntity144Repository repo;
    public EnterpriseAnalyticsEntity144Service(EnterpriseAnalyticsEntity144Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity144> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity144 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity144 create(EnterpriseAnalyticsEntity144 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity144 update(UUID id, EnterpriseAnalyticsEntity144 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity144> all = repo.findAll();
        for(EnterpriseAnalyticsEntity144 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
