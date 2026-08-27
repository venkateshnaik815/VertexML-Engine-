package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity147;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity147Repository extends JpaRepository<EnterpriseAnalyticsEntity147, UUID> {
    List<EnterpriseAnalyticsEntity147> findByName(String name);
    List<EnterpriseAnalyticsEntity147> findByStatus(String status);
    List<EnterpriseAnalyticsEntity147> findByType(String type);
    List<EnterpriseAnalyticsEntity147> findByIsActiveTrue();
}
