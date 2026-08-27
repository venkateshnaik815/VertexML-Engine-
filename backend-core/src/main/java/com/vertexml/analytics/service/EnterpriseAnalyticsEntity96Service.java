package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity96;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity96Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity96Service {
    private final EnterpriseAnalyticsEntity96Repository repo;
    public EnterpriseAnalyticsEntity96Service(EnterpriseAnalyticsEntity96Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity96> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity96 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity96 create(EnterpriseAnalyticsEntity96 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity96 update(UUID id, EnterpriseAnalyticsEntity96 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity96> all = repo.findAll();
        for(EnterpriseAnalyticsEntity96 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
