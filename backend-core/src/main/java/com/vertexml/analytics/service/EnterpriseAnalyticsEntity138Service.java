package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity138;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity138Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity138Service {
    private final EnterpriseAnalyticsEntity138Repository repo;
    public EnterpriseAnalyticsEntity138Service(EnterpriseAnalyticsEntity138Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity138> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity138 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity138 create(EnterpriseAnalyticsEntity138 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity138 update(UUID id, EnterpriseAnalyticsEntity138 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity138> all = repo.findAll();
        for(EnterpriseAnalyticsEntity138 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
