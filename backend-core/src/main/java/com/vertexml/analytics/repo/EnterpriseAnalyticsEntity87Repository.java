package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity87;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity87Repository extends JpaRepository<EnterpriseAnalyticsEntity87, UUID> {
    List<EnterpriseAnalyticsEntity87> findByName(String name);
    List<EnterpriseAnalyticsEntity87> findByStatus(String status);
    List<EnterpriseAnalyticsEntity87> findByType(String type);
    List<EnterpriseAnalyticsEntity87> findByIsActiveTrue();
}
