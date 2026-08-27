package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity17;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity17Repository extends JpaRepository<EnterpriseAnalyticsEntity17, UUID> {
    List<EnterpriseAnalyticsEntity17> findByName(String name);
    List<EnterpriseAnalyticsEntity17> findByStatus(String status);
    List<EnterpriseAnalyticsEntity17> findByType(String type);
    List<EnterpriseAnalyticsEntity17> findByIsActiveTrue();
}
