package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity144;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity144Repository extends JpaRepository<EnterpriseAnalyticsEntity144, UUID> {
    List<EnterpriseAnalyticsEntity144> findByName(String name);
    List<EnterpriseAnalyticsEntity144> findByStatus(String status);
    List<EnterpriseAnalyticsEntity144> findByType(String type);
    List<EnterpriseAnalyticsEntity144> findByIsActiveTrue();
}
