package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity51;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity51Repository extends JpaRepository<EnterpriseAnalyticsEntity51, UUID> {
    List<EnterpriseAnalyticsEntity51> findByName(String name);
    List<EnterpriseAnalyticsEntity51> findByStatus(String status);
    List<EnterpriseAnalyticsEntity51> findByType(String type);
    List<EnterpriseAnalyticsEntity51> findByIsActiveTrue();
}
