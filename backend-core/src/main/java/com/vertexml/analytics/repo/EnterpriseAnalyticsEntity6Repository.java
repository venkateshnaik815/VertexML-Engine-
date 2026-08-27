package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity6;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity6Repository extends JpaRepository<EnterpriseAnalyticsEntity6, UUID> {
    List<EnterpriseAnalyticsEntity6> findByName(String name);
    List<EnterpriseAnalyticsEntity6> findByStatus(String status);
    List<EnterpriseAnalyticsEntity6> findByType(String type);
    List<EnterpriseAnalyticsEntity6> findByIsActiveTrue();
}
