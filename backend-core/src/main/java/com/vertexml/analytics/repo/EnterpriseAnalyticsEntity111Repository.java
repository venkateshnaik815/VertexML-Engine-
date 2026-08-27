package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity111;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity111Repository extends JpaRepository<EnterpriseAnalyticsEntity111, UUID> {
    List<EnterpriseAnalyticsEntity111> findByName(String name);
    List<EnterpriseAnalyticsEntity111> findByStatus(String status);
    List<EnterpriseAnalyticsEntity111> findByType(String type);
    List<EnterpriseAnalyticsEntity111> findByIsActiveTrue();
}
