package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity120;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity120Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity120Service {
    private final EnterpriseAnalyticsEntity120Repository repo;
    public EnterpriseAnalyticsEntity120Service(EnterpriseAnalyticsEntity120Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity120> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity120 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity120 create(EnterpriseAnalyticsEntity120 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity120 update(UUID id, EnterpriseAnalyticsEntity120 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity120> all = repo.findAll();
        for(EnterpriseAnalyticsEntity120 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
