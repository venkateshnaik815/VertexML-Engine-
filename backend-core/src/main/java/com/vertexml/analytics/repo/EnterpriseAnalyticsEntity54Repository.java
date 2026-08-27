package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity54;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity54Repository extends JpaRepository<EnterpriseAnalyticsEntity54, UUID> {
    List<EnterpriseAnalyticsEntity54> findByName(String name);
    List<EnterpriseAnalyticsEntity54> findByStatus(String status);
    List<EnterpriseAnalyticsEntity54> findByType(String type);
    List<EnterpriseAnalyticsEntity54> findByIsActiveTrue();
}
