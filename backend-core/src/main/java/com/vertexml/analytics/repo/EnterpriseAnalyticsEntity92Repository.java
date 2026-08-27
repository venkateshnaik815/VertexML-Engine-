package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity92;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity92Repository extends JpaRepository<EnterpriseAnalyticsEntity92, UUID> {
    List<EnterpriseAnalyticsEntity92> findByName(String name);
    List<EnterpriseAnalyticsEntity92> findByStatus(String status);
    List<EnterpriseAnalyticsEntity92> findByType(String type);
    List<EnterpriseAnalyticsEntity92> findByIsActiveTrue();
}
