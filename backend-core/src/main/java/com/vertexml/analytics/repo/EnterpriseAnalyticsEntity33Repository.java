package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity33;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity33Repository extends JpaRepository<EnterpriseAnalyticsEntity33, UUID> {
    List<EnterpriseAnalyticsEntity33> findByName(String name);
    List<EnterpriseAnalyticsEntity33> findByStatus(String status);
    List<EnterpriseAnalyticsEntity33> findByType(String type);
    List<EnterpriseAnalyticsEntity33> findByIsActiveTrue();
}
