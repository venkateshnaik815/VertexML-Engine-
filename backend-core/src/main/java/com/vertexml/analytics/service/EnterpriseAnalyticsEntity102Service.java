package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity102;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity102Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity102Service {
    private final EnterpriseAnalyticsEntity102Repository repo;
    public EnterpriseAnalyticsEntity102Service(EnterpriseAnalyticsEntity102Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity102> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity102 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity102 create(EnterpriseAnalyticsEntity102 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity102 update(UUID id, EnterpriseAnalyticsEntity102 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity102> all = repo.findAll();
        for(EnterpriseAnalyticsEntity102 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
