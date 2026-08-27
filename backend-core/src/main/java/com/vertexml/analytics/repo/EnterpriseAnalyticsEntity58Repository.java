package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity58;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity58Repository extends JpaRepository<EnterpriseAnalyticsEntity58, UUID> {
    List<EnterpriseAnalyticsEntity58> findByName(String name);
    List<EnterpriseAnalyticsEntity58> findByStatus(String status);
    List<EnterpriseAnalyticsEntity58> findByType(String type);
    List<EnterpriseAnalyticsEntity58> findByIsActiveTrue();
}
