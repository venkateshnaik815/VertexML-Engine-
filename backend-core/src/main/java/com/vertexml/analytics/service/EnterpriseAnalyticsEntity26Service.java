package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity26;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity26Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity26Service {
    private final EnterpriseAnalyticsEntity26Repository repo;
    public EnterpriseAnalyticsEntity26Service(EnterpriseAnalyticsEntity26Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity26> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity26 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity26 create(EnterpriseAnalyticsEntity26 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity26 update(UUID id, EnterpriseAnalyticsEntity26 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity26> all = repo.findAll();
        for(EnterpriseAnalyticsEntity26 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
