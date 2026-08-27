package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity36;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity36Repository extends JpaRepository<EnterpriseAnalyticsEntity36, UUID> {
    List<EnterpriseAnalyticsEntity36> findByName(String name);
    List<EnterpriseAnalyticsEntity36> findByStatus(String status);
    List<EnterpriseAnalyticsEntity36> findByType(String type);
    List<EnterpriseAnalyticsEntity36> findByIsActiveTrue();
}
