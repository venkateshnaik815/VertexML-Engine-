package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity104;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity104Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity104Service {
    private final EnterpriseAnalyticsEntity104Repository repo;
    public EnterpriseAnalyticsEntity104Service(EnterpriseAnalyticsEntity104Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity104> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity104 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity104 create(EnterpriseAnalyticsEntity104 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity104 update(UUID id, EnterpriseAnalyticsEntity104 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity104> all = repo.findAll();
        for(EnterpriseAnalyticsEntity104 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
