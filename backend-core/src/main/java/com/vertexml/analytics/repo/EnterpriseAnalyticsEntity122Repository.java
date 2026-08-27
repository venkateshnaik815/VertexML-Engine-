package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity122;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity122Repository extends JpaRepository<EnterpriseAnalyticsEntity122, UUID> {
    List<EnterpriseAnalyticsEntity122> findByName(String name);
    List<EnterpriseAnalyticsEntity122> findByStatus(String status);
    List<EnterpriseAnalyticsEntity122> findByType(String type);
    List<EnterpriseAnalyticsEntity122> findByIsActiveTrue();
}
