package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity70;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity70Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity70Service {
    private final EnterpriseAnalyticsEntity70Repository repo;
    public EnterpriseAnalyticsEntity70Service(EnterpriseAnalyticsEntity70Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity70> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity70 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity70 create(EnterpriseAnalyticsEntity70 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity70 update(UUID id, EnterpriseAnalyticsEntity70 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity70> all = repo.findAll();
        for(EnterpriseAnalyticsEntity70 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
