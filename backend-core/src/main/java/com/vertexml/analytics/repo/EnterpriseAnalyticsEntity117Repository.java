package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity117;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity117Repository extends JpaRepository<EnterpriseAnalyticsEntity117, UUID> {
    List<EnterpriseAnalyticsEntity117> findByName(String name);
    List<EnterpriseAnalyticsEntity117> findByStatus(String status);
    List<EnterpriseAnalyticsEntity117> findByType(String type);
    List<EnterpriseAnalyticsEntity117> findByIsActiveTrue();
}
