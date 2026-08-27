package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity110;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity110Repository extends JpaRepository<EnterpriseAnalyticsEntity110, UUID> {
    List<EnterpriseAnalyticsEntity110> findByName(String name);
    List<EnterpriseAnalyticsEntity110> findByStatus(String status);
    List<EnterpriseAnalyticsEntity110> findByType(String type);
    List<EnterpriseAnalyticsEntity110> findByIsActiveTrue();
}
