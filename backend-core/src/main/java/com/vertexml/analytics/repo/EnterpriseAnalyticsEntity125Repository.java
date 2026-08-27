package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity125;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity125Repository extends JpaRepository<EnterpriseAnalyticsEntity125, UUID> {
    List<EnterpriseAnalyticsEntity125> findByName(String name);
    List<EnterpriseAnalyticsEntity125> findByStatus(String status);
    List<EnterpriseAnalyticsEntity125> findByType(String type);
    List<EnterpriseAnalyticsEntity125> findByIsActiveTrue();
}
