package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity80;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity80Repository extends JpaRepository<EnterpriseAnalyticsEntity80, UUID> {
    List<EnterpriseAnalyticsEntity80> findByName(String name);
    List<EnterpriseAnalyticsEntity80> findByStatus(String status);
    List<EnterpriseAnalyticsEntity80> findByType(String type);
    List<EnterpriseAnalyticsEntity80> findByIsActiveTrue();
}
