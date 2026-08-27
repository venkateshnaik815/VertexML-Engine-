package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity2;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity2Repository extends JpaRepository<EnterpriseAnalyticsEntity2, UUID> {
    List<EnterpriseAnalyticsEntity2> findByName(String name);
    List<EnterpriseAnalyticsEntity2> findByStatus(String status);
    List<EnterpriseAnalyticsEntity2> findByType(String type);
    List<EnterpriseAnalyticsEntity2> findByIsActiveTrue();
}
