package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity91;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity91Repository extends JpaRepository<EnterpriseAnalyticsEntity91, UUID> {
    List<EnterpriseAnalyticsEntity91> findByName(String name);
    List<EnterpriseAnalyticsEntity91> findByStatus(String status);
    List<EnterpriseAnalyticsEntity91> findByType(String type);
    List<EnterpriseAnalyticsEntity91> findByIsActiveTrue();
}
