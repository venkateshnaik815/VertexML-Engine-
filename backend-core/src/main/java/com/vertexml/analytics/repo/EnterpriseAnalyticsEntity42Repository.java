package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity42;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity42Repository extends JpaRepository<EnterpriseAnalyticsEntity42, UUID> {
    List<EnterpriseAnalyticsEntity42> findByName(String name);
    List<EnterpriseAnalyticsEntity42> findByStatus(String status);
    List<EnterpriseAnalyticsEntity42> findByType(String type);
    List<EnterpriseAnalyticsEntity42> findByIsActiveTrue();
}
