package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity81;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity81Repository extends JpaRepository<EnterpriseAnalyticsEntity81, UUID> {
    List<EnterpriseAnalyticsEntity81> findByName(String name);
    List<EnterpriseAnalyticsEntity81> findByStatus(String status);
    List<EnterpriseAnalyticsEntity81> findByType(String type);
    List<EnterpriseAnalyticsEntity81> findByIsActiveTrue();
}
