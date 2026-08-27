package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity15;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity15Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity15Service {
    private final EnterpriseAnalyticsEntity15Repository repo;
    public EnterpriseAnalyticsEntity15Service(EnterpriseAnalyticsEntity15Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity15> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity15 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity15 create(EnterpriseAnalyticsEntity15 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity15 update(UUID id, EnterpriseAnalyticsEntity15 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity15> all = repo.findAll();
        for(EnterpriseAnalyticsEntity15 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
