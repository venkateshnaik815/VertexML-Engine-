package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity3;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity3Repository extends JpaRepository<EnterpriseAnalyticsEntity3, UUID> {
    List<EnterpriseAnalyticsEntity3> findByName(String name);
    List<EnterpriseAnalyticsEntity3> findByStatus(String status);
    List<EnterpriseAnalyticsEntity3> findByType(String type);
    List<EnterpriseAnalyticsEntity3> findByIsActiveTrue();
}
