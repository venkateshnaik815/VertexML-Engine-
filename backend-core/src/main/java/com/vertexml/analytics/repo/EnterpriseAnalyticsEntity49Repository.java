package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity49;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity49Repository extends JpaRepository<EnterpriseAnalyticsEntity49, UUID> {
    List<EnterpriseAnalyticsEntity49> findByName(String name);
    List<EnterpriseAnalyticsEntity49> findByStatus(String status);
    List<EnterpriseAnalyticsEntity49> findByType(String type);
    List<EnterpriseAnalyticsEntity49> findByIsActiveTrue();
}
