package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity52;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity52Repository extends JpaRepository<EnterpriseAnalyticsEntity52, UUID> {
    List<EnterpriseAnalyticsEntity52> findByName(String name);
    List<EnterpriseAnalyticsEntity52> findByStatus(String status);
    List<EnterpriseAnalyticsEntity52> findByType(String type);
    List<EnterpriseAnalyticsEntity52> findByIsActiveTrue();
}
