package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity77;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity77Repository extends JpaRepository<EnterpriseAnalyticsEntity77, UUID> {
    List<EnterpriseAnalyticsEntity77> findByName(String name);
    List<EnterpriseAnalyticsEntity77> findByStatus(String status);
    List<EnterpriseAnalyticsEntity77> findByType(String type);
    List<EnterpriseAnalyticsEntity77> findByIsActiveTrue();
}
