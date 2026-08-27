package com.vertexml.analytics.service;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity103;
import com.vertexml.analytics.repo.EnterpriseAnalyticsEntity103Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EnterpriseAnalyticsEntity103Service {
    private final EnterpriseAnalyticsEntity103Repository repo;
    public EnterpriseAnalyticsEntity103Service(EnterpriseAnalyticsEntity103Repository repo) { this.repo = repo; }
    
    public List<EnterpriseAnalyticsEntity103> getAll() { return repo.findAll(); }
    public EnterpriseAnalyticsEntity103 getById(UUID id) { return repo.findById(id).orElse(null); }
    public EnterpriseAnalyticsEntity103 create(EnterpriseAnalyticsEntity103 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public EnterpriseAnalyticsEntity103 update(UUID id, EnterpriseAnalyticsEntity103 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<EnterpriseAnalyticsEntity103> all = repo.findAll();
        for(EnterpriseAnalyticsEntity103 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
