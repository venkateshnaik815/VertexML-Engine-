package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity12;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity12Repository extends JpaRepository<EnterpriseAnalyticsEntity12, UUID> {
    List<EnterpriseAnalyticsEntity12> findByName(String name);
    List<EnterpriseAnalyticsEntity12> findByStatus(String status);
    List<EnterpriseAnalyticsEntity12> findByType(String type);
    List<EnterpriseAnalyticsEntity12> findByIsActiveTrue();
}
