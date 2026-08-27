package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity25;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity25Repository extends JpaRepository<EnterpriseAnalyticsEntity25, UUID> {
    List<EnterpriseAnalyticsEntity25> findByName(String name);
    List<EnterpriseAnalyticsEntity25> findByStatus(String status);
    List<EnterpriseAnalyticsEntity25> findByType(String type);
    List<EnterpriseAnalyticsEntity25> findByIsActiveTrue();
}
