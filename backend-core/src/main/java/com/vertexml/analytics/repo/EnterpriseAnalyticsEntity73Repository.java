package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity73;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity73Repository extends JpaRepository<EnterpriseAnalyticsEntity73, UUID> {
    List<EnterpriseAnalyticsEntity73> findByName(String name);
    List<EnterpriseAnalyticsEntity73> findByStatus(String status);
    List<EnterpriseAnalyticsEntity73> findByType(String type);
    List<EnterpriseAnalyticsEntity73> findByIsActiveTrue();
}
