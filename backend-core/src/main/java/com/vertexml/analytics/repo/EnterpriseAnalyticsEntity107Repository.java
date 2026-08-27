package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity107;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity107Repository extends JpaRepository<EnterpriseAnalyticsEntity107, UUID> {
    List<EnterpriseAnalyticsEntity107> findByName(String name);
    List<EnterpriseAnalyticsEntity107> findByStatus(String status);
    List<EnterpriseAnalyticsEntity107> findByType(String type);
    List<EnterpriseAnalyticsEntity107> findByIsActiveTrue();
}
