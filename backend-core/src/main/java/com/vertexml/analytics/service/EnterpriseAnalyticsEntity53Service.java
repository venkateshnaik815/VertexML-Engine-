package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity53;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity53Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity53Service {
    private final EnterpriseAnalyticsEntity53Repository repo;
    public EnterpriseAnalyticsEntity53Service(EnterpriseAnalyticsEntity53Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity53> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity53 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity53 create(EnterpriseAnalyticsEntity53 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity53 update(UUID id, EnterpriseAnalyticsEntity53 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity53> all = repo.findAll();
        for(EnterpriseAnalyticsEntity53 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
