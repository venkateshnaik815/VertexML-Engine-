package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity45;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity45Repository extends JpaRepository<EnterpriseAnalyticsEntity45, UUID> {
    List<EnterpriseAnalyticsEntity45> findByName(String name);
    List<EnterpriseAnalyticsEntity45> findByStatus(String status);
    List<EnterpriseAnalyticsEntity45> findByType(String type);
    List<EnterpriseAnalyticsEntity45> findByIsActiveTrue();
}
