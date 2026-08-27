package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity123;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity123Repository extends JpaRepository<EnterpriseAnalyticsEntity123, UUID> {
    List<EnterpriseAnalyticsEntity123> findByName(String name);
    List<EnterpriseAnalyticsEntity123> findByStatus(String status);
    List<EnterpriseAnalyticsEntity123> findByType(String type);
    List<EnterpriseAnalyticsEntity123> findByIsActiveTrue();
}
