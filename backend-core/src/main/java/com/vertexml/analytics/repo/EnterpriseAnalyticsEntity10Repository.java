package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity10;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity10Repository extends JpaRepository<EnterpriseAnalyticsEntity10, UUID> {
    List<EnterpriseAnalyticsEntity10> findByName(String name);
    List<EnterpriseAnalyticsEntity10> findByStatus(String status);
    List<EnterpriseAnalyticsEntity10> findByType(String type);
    List<EnterpriseAnalyticsEntity10> findByIsActiveTrue();
}
