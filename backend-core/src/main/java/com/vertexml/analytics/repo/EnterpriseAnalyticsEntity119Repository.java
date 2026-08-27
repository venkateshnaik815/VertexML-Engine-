package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity119;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity119Repository extends JpaRepository<EnterpriseAnalyticsEntity119, UUID> {
    List<EnterpriseAnalyticsEntity119> findByName(String name);
    List<EnterpriseAnalyticsEntity119> findByStatus(String status);
    List<EnterpriseAnalyticsEntity119> findByType(String type);
    List<EnterpriseAnalyticsEntity119> findByIsActiveTrue();
}
