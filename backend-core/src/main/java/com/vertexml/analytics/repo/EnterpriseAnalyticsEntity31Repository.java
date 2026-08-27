package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity31;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity31Repository extends JpaRepository<EnterpriseAnalyticsEntity31, UUID> {
    List<EnterpriseAnalyticsEntity31> findByName(String name);
    List<EnterpriseAnalyticsEntity31> findByStatus(String status);
    List<EnterpriseAnalyticsEntity31> findByType(String type);
    List<EnterpriseAnalyticsEntity31> findByIsActiveTrue();
}
