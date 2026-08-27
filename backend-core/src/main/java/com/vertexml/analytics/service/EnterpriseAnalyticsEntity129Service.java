package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity129;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity129Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity129Service {
    private final EnterpriseAnalyticsEntity129Repository repo;
    public EnterpriseAnalyticsEntity129Service(EnterpriseAnalyticsEntity129Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity129> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity129 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity129 create(EnterpriseAnalyticsEntity129 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity129 update(UUID id, EnterpriseAnalyticsEntity129 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity129> all = repo.findAll();
        for(EnterpriseAnalyticsEntity129 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
