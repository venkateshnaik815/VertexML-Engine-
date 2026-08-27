package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity133;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity133Repository extends JpaRepository<EnterpriseAnalyticsEntity133, UUID> {
    List<EnterpriseAnalyticsEntity133> findByName(String name);
    List<EnterpriseAnalyticsEntity133> findByStatus(String status);
    List<EnterpriseAnalyticsEntity133> findByType(String type);
    List<EnterpriseAnalyticsEntity133> findByIsActiveTrue();
}
