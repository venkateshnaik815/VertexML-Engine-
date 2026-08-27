package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity95;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity95Repository extends JpaRepository<EnterpriseAnalyticsEntity95, UUID> {
    List<EnterpriseAnalyticsEntity95> findByName(String name);
    List<EnterpriseAnalyticsEntity95> findByStatus(String status);
    List<EnterpriseAnalyticsEntity95> findByType(String type);
    List<EnterpriseAnalyticsEntity95> findByIsActiveTrue();
}
