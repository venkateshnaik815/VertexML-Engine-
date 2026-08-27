package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity86;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity86Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity86Service {
    private final EnterpriseAnalyticsEntity86Repository repo;
    public EnterpriseAnalyticsEntity86Service(EnterpriseAnalyticsEntity86Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity86> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity86 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity86 create(EnterpriseAnalyticsEntity86 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity86 update(UUID id, EnterpriseAnalyticsEntity86 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity86> all = repo.findAll();
        for(EnterpriseAnalyticsEntity86 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
