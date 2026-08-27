package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity84;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity84Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity84Service {
    private final EnterpriseAnalyticsEntity84Repository repo;
    public EnterpriseAnalyticsEntity84Service(EnterpriseAnalyticsEntity84Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity84> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity84 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity84 create(EnterpriseAnalyticsEntity84 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity84 update(UUID id, EnterpriseAnalyticsEntity84 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity84> all = repo.findAll();
        for(EnterpriseAnalyticsEntity84 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
