package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity72;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity72Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity72Service {
    private final EnterpriseAnalyticsEntity72Repository repo;
    public EnterpriseAnalyticsEntity72Service(EnterpriseAnalyticsEntity72Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity72> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity72 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity72 create(EnterpriseAnalyticsEntity72 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity72 update(UUID id, EnterpriseAnalyticsEntity72 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity72> all = repo.findAll();
        for(EnterpriseAnalyticsEntity72 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
