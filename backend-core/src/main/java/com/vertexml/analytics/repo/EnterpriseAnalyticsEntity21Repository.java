package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity21;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity21Repository extends JpaRepository<EnterpriseAnalyticsEntity21, UUID> {
    List<EnterpriseAnalyticsEntity21> findByName(String name);
    List<EnterpriseAnalyticsEntity21> findByStatus(String status);
    List<EnterpriseAnalyticsEntity21> findByType(String type);
    List<EnterpriseAnalyticsEntity21> findByIsActiveTrue();
}
