package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity74;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity74Repository extends JpaRepository<EnterpriseAnalyticsEntity74, UUID> {
    List<EnterpriseAnalyticsEntity74> findByName(String name);
    List<EnterpriseAnalyticsEntity74> findByStatus(String status);
    List<EnterpriseAnalyticsEntity74> findByType(String type);
    List<EnterpriseAnalyticsEntity74> findByIsActiveTrue();
}
