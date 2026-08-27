package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity116;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity116Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity116Service {
    private final EnterpriseAnalyticsEntity116Repository repo;
    public EnterpriseAnalyticsEntity116Service(EnterpriseAnalyticsEntity116Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity116> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity116 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity116 create(EnterpriseAnalyticsEntity116 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity116 update(UUID id, EnterpriseAnalyticsEntity116 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity116> all = repo.findAll();
        for(EnterpriseAnalyticsEntity116 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
