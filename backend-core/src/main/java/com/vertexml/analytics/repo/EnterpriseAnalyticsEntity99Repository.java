package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity99;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity99Repository extends JpaRepository<EnterpriseAnalyticsEntity99, UUID> {
    List<EnterpriseAnalyticsEntity99> findByName(String name);
    List<EnterpriseAnalyticsEntity99> findByStatus(String status);
    List<EnterpriseAnalyticsEntity99> findByType(String type);
    List<EnterpriseAnalyticsEntity99> findByIsActiveTrue();
}
