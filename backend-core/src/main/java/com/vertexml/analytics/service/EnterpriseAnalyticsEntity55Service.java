package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity55;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity55Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity55Service {
    private final EnterpriseAnalyticsEntity55Repository repo;
    public EnterpriseAnalyticsEntity55Service(EnterpriseAnalyticsEntity55Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity55> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity55 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity55 create(EnterpriseAnalyticsEntity55 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity55 update(UUID id, EnterpriseAnalyticsEntity55 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity55> all = repo.findAll();
        for(EnterpriseAnalyticsEntity55 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
