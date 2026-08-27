package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity60;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity60Repository extends JpaRepository<EnterpriseAnalyticsEntity60, UUID> {
    List<EnterpriseAnalyticsEntity60> findByName(String name);
    List<EnterpriseAnalyticsEntity60> findByStatus(String status);
    List<EnterpriseAnalyticsEntity60> findByType(String type);
    List<EnterpriseAnalyticsEntity60> findByIsActiveTrue();
}
