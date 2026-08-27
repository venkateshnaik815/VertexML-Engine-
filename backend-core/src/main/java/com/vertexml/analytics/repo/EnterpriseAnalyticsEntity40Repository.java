package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity40;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity40Repository extends JpaRepository<EnterpriseAnalyticsEntity40, UUID> {
    List<EnterpriseAnalyticsEntity40> findByName(String name);
    List<EnterpriseAnalyticsEntity40> findByStatus(String status);
    List<EnterpriseAnalyticsEntity40> findByType(String type);
    List<EnterpriseAnalyticsEntity40> findByIsActiveTrue();
}
