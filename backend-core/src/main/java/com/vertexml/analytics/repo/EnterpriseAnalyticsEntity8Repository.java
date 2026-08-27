package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity8;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity8Repository extends JpaRepository<EnterpriseAnalyticsEntity8, UUID> {
    List<EnterpriseAnalyticsEntity8> findByName(String name);
    List<EnterpriseAnalyticsEntity8> findByStatus(String status);
    List<EnterpriseAnalyticsEntity8> findByType(String type);
    List<EnterpriseAnalyticsEntity8> findByIsActiveTrue();
}
