package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity131;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity131Repository extends JpaRepository<EnterpriseAnalyticsEntity131, UUID> {
    List<EnterpriseAnalyticsEntity131> findByName(String name);
    List<EnterpriseAnalyticsEntity131> findByStatus(String status);
    List<EnterpriseAnalyticsEntity131> findByType(String type);
    List<EnterpriseAnalyticsEntity131> findByIsActiveTrue();
}
