package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity68;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity68Repository extends JpaRepository<EnterpriseAnalyticsEntity68, UUID> {
    List<EnterpriseAnalyticsEntity68> findByName(String name);
    List<EnterpriseAnalyticsEntity68> findByStatus(String status);
    List<EnterpriseAnalyticsEntity68> findByType(String type);
    List<EnterpriseAnalyticsEntity68> findByIsActiveTrue();
}
