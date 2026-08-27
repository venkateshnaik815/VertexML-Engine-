package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity29;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity29Repository extends JpaRepository<EnterpriseAnalyticsEntity29, UUID> {
    List<EnterpriseAnalyticsEntity29> findByName(String name);
    List<EnterpriseAnalyticsEntity29> findByStatus(String status);
    List<EnterpriseAnalyticsEntity29> findByType(String type);
    List<EnterpriseAnalyticsEntity29> findByIsActiveTrue();
}
