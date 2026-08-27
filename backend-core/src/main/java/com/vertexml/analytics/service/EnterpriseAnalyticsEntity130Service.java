package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity130;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity130Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity130Service {
    private final EnterpriseAnalyticsEntity130Repository repo;
    public EnterpriseAnalyticsEntity130Service(EnterpriseAnalyticsEntity130Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity130> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity130 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity130 create(EnterpriseAnalyticsEntity130 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity130 update(UUID id, EnterpriseAnalyticsEntity130 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity130> all = repo.findAll();
        for(EnterpriseAnalyticsEntity130 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
