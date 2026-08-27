package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity90;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity90Repository extends JpaRepository<EnterpriseAnalyticsEntity90, UUID> {
    List<EnterpriseAnalyticsEntity90> findByName(String name);
    List<EnterpriseAnalyticsEntity90> findByStatus(String status);
    List<EnterpriseAnalyticsEntity90> findByType(String type);
    List<EnterpriseAnalyticsEntity90> findByIsActiveTrue();
}
