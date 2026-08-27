package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity63;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity63Repository extends JpaRepository<EnterpriseAnalyticsEntity63, UUID> {
    List<EnterpriseAnalyticsEntity63> findByName(String name);
    List<EnterpriseAnalyticsEntity63> findByStatus(String status);
    List<EnterpriseAnalyticsEntity63> findByType(String type);
    List<EnterpriseAnalyticsEntity63> findByIsActiveTrue();
}
