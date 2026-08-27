package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity48;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity48Repository extends JpaRepository<EnterpriseAnalyticsEntity48, UUID> {
    List<EnterpriseAnalyticsEntity48> findByName(String name);
    List<EnterpriseAnalyticsEntity48> findByStatus(String status);
    List<EnterpriseAnalyticsEntity48> findByType(String type);
    List<EnterpriseAnalyticsEntity48> findByIsActiveTrue();
}
