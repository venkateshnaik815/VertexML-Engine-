package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity16;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity16Repository extends JpaRepository<EnterpriseAnalyticsEntity16, UUID> {
    List<EnterpriseAnalyticsEntity16> findByName(String name);
    List<EnterpriseAnalyticsEntity16> findByStatus(String status);
    List<EnterpriseAnalyticsEntity16> findByType(String type);
    List<EnterpriseAnalyticsEntity16> findByIsActiveTrue();
}
