package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity64;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity64Repository extends JpaRepository<EnterpriseAnalyticsEntity64, UUID> {
    List<EnterpriseAnalyticsEntity64> findByName(String name);
    List<EnterpriseAnalyticsEntity64> findByStatus(String status);
    List<EnterpriseAnalyticsEntity64> findByType(String type);
    List<EnterpriseAnalyticsEntity64> findByIsActiveTrue();
}
