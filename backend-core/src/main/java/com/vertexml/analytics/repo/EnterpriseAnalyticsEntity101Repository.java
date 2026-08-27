package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity101;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity101Repository extends JpaRepository<EnterpriseAnalyticsEntity101, UUID> {
    List<EnterpriseAnalyticsEntity101> findByName(String name);
    List<EnterpriseAnalyticsEntity101> findByStatus(String status);
    List<EnterpriseAnalyticsEntity101> findByType(String type);
    List<EnterpriseAnalyticsEntity101> findByIsActiveTrue();
}
