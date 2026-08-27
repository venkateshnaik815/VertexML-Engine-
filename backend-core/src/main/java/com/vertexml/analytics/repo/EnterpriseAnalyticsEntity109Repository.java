package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity109;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity109Repository extends JpaRepository<EnterpriseAnalyticsEntity109, UUID> {
    List<EnterpriseAnalyticsEntity109> findByName(String name);
    List<EnterpriseAnalyticsEntity109> findByStatus(String status);
    List<EnterpriseAnalyticsEntity109> findByType(String type);
    List<EnterpriseAnalyticsEntity109> findByIsActiveTrue();
}
