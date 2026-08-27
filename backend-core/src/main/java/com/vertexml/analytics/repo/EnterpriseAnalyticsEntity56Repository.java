package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity56;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity56Repository extends JpaRepository<EnterpriseAnalyticsEntity56, UUID> {
    List<EnterpriseAnalyticsEntity56> findByName(String name);
    List<EnterpriseAnalyticsEntity56> findByStatus(String status);
    List<EnterpriseAnalyticsEntity56> findByType(String type);
    List<EnterpriseAnalyticsEntity56> findByIsActiveTrue();
}
