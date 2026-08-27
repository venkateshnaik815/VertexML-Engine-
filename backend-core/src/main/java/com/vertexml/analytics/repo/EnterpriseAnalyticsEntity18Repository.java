package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity18;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity18Repository extends JpaRepository<EnterpriseAnalyticsEntity18, UUID> {
    List<EnterpriseAnalyticsEntity18> findByName(String name);
    List<EnterpriseAnalyticsEntity18> findByStatus(String status);
    List<EnterpriseAnalyticsEntity18> findByType(String type);
    List<EnterpriseAnalyticsEntity18> findByIsActiveTrue();
}
