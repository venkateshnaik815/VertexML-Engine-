package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity14;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity14Repository extends JpaRepository<EnterpriseAnalyticsEntity14, UUID> {
    List<EnterpriseAnalyticsEntity14> findByName(String name);
    List<EnterpriseAnalyticsEntity14> findByStatus(String status);
    List<EnterpriseAnalyticsEntity14> findByType(String type);
    List<EnterpriseAnalyticsEntity14> findByIsActiveTrue();
}
