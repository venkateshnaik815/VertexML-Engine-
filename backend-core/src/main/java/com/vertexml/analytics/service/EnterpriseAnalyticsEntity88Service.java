package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity88;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity88Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity88Service {
    private final EnterpriseAnalyticsEntity88Repository repo;
    public EnterpriseAnalyticsEntity88Service(EnterpriseAnalyticsEntity88Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity88> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity88 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity88 create(EnterpriseAnalyticsEntity88 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity88 update(UUID id, EnterpriseAnalyticsEntity88 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity88> all = repo.findAll();
        for(EnterpriseAnalyticsEntity88 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
