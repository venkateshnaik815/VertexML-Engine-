package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity62;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity62Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity62Service {
    private final EnterpriseAnalyticsEntity62Repository repo;
    public EnterpriseAnalyticsEntity62Service(EnterpriseAnalyticsEntity62Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity62> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity62 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity62 create(EnterpriseAnalyticsEntity62 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity62 update(UUID id, EnterpriseAnalyticsEntity62 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity62> all = repo.findAll();
        for(EnterpriseAnalyticsEntity62 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
