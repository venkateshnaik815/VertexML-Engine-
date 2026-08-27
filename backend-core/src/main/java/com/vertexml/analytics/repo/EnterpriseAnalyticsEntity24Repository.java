package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity24;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity24Repository extends JpaRepository<EnterpriseAnalyticsEntity24, UUID> {
    List<EnterpriseAnalyticsEntity24> findByName(String name);
    List<EnterpriseAnalyticsEntity24> findByStatus(String status);
    List<EnterpriseAnalyticsEntity24> findByType(String type);
    List<EnterpriseAnalyticsEntity24> findByIsActiveTrue();
}
