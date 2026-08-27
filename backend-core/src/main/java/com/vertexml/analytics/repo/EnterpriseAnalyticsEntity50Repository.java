package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity50;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity50Repository extends JpaRepository<EnterpriseAnalyticsEntity50, UUID> {
    List<EnterpriseAnalyticsEntity50> findByName(String name);
    List<EnterpriseAnalyticsEntity50> findByStatus(String status);
    List<EnterpriseAnalyticsEntity50> findByType(String type);
    List<EnterpriseAnalyticsEntity50> findByIsActiveTrue();
}
