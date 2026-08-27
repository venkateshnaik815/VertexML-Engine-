package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity102;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity102Repository extends JpaRepository<EnterpriseAnalyticsEntity102, UUID> {
    List<EnterpriseAnalyticsEntity102> findByName(String name);
    List<EnterpriseAnalyticsEntity102> findByStatus(String status);
    List<EnterpriseAnalyticsEntity102> findByType(String type);
    List<EnterpriseAnalyticsEntity102> findByIsActiveTrue();
}
