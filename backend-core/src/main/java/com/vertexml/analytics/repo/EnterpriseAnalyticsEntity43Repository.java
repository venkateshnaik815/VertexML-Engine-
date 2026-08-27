package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity43;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity43Repository extends JpaRepository<EnterpriseAnalyticsEntity43, UUID> {
    List<EnterpriseAnalyticsEntity43> findByName(String name);
    List<EnterpriseAnalyticsEntity43> findByStatus(String status);
    List<EnterpriseAnalyticsEntity43> findByType(String type);
    List<EnterpriseAnalyticsEntity43> findByIsActiveTrue();
}
