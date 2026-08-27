package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity94;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity94Repository extends JpaRepository<EnterpriseAnalyticsEntity94, UUID> {
    List<EnterpriseAnalyticsEntity94> findByName(String name);
    List<EnterpriseAnalyticsEntity94> findByStatus(String status);
    List<EnterpriseAnalyticsEntity94> findByType(String type);
    List<EnterpriseAnalyticsEntity94> findByIsActiveTrue();
}
