package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity100;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity100Repository extends JpaRepository<EnterpriseAnalyticsEntity100, UUID> {
    List<EnterpriseAnalyticsEntity100> findByName(String name);
    List<EnterpriseAnalyticsEntity100> findByStatus(String status);
    List<EnterpriseAnalyticsEntity100> findByType(String type);
    List<EnterpriseAnalyticsEntity100> findByIsActiveTrue();
}
