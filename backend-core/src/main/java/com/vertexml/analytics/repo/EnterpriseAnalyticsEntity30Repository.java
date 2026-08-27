package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity30;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity30Repository extends JpaRepository<EnterpriseAnalyticsEntity30, UUID> {
    List<EnterpriseAnalyticsEntity30> findByName(String name);
    List<EnterpriseAnalyticsEntity30> findByStatus(String status);
    List<EnterpriseAnalyticsEntity30> findByType(String type);
    List<EnterpriseAnalyticsEntity30> findByIsActiveTrue();
}
