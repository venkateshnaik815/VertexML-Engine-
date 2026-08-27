package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity105;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity105Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity105Service {
    private final EnterpriseAnalyticsEntity105Repository repo;
    public EnterpriseAnalyticsEntity105Service(EnterpriseAnalyticsEntity105Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity105> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity105 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity105 create(EnterpriseAnalyticsEntity105 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity105 update(UUID id, EnterpriseAnalyticsEntity105 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity105> all = repo.findAll();
        for(EnterpriseAnalyticsEntity105 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
