package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity41;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity41Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity41Service {
    private final EnterpriseAnalyticsEntity41Repository repo;
    public EnterpriseAnalyticsEntity41Service(EnterpriseAnalyticsEntity41Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity41> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity41 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity41 create(EnterpriseAnalyticsEntity41 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity41 update(UUID id, EnterpriseAnalyticsEntity41 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity41> all = repo.findAll();
        for(EnterpriseAnalyticsEntity41 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
