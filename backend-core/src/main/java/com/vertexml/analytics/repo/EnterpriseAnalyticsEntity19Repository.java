package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity19;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity19Repository extends JpaRepository<EnterpriseAnalyticsEntity19, UUID> {
    List<EnterpriseAnalyticsEntity19> findByName(String name);
    List<EnterpriseAnalyticsEntity19> findByStatus(String status);
    List<EnterpriseAnalyticsEntity19> findByType(String type);
    List<EnterpriseAnalyticsEntity19> findByIsActiveTrue();
}
