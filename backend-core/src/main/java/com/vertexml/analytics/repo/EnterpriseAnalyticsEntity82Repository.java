package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity82;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity82Repository extends JpaRepository<EnterpriseAnalyticsEntity82, UUID> {
    List<EnterpriseAnalyticsEntity82> findByName(String name);
    List<EnterpriseAnalyticsEntity82> findByStatus(String status);
    List<EnterpriseAnalyticsEntity82> findByType(String type);
    List<EnterpriseAnalyticsEntity82> findByIsActiveTrue();
}
