package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity146;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity146Repository extends JpaRepository<EnterpriseAnalyticsEntity146, UUID> {
    List<EnterpriseAnalyticsEntity146> findByName(String name);
    List<EnterpriseAnalyticsEntity146> findByStatus(String status);
    List<EnterpriseAnalyticsEntity146> findByType(String type);
    List<EnterpriseAnalyticsEntity146> findByIsActiveTrue();
}
