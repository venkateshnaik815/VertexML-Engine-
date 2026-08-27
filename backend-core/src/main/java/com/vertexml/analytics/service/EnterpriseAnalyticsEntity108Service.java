package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity108;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity108Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity108Service {
    private final EnterpriseAnalyticsEntity108Repository repo;
    public EnterpriseAnalyticsEntity108Service(EnterpriseAnalyticsEntity108Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity108> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity108 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity108 create(EnterpriseAnalyticsEntity108 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity108 update(UUID id, EnterpriseAnalyticsEntity108 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity108> all = repo.findAll();
        for(EnterpriseAnalyticsEntity108 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
