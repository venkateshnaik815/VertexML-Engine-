package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity97;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity97Repository extends JpaRepository<EnterpriseAnalyticsEntity97, UUID> {
    List<EnterpriseAnalyticsEntity97> findByName(String name);
    List<EnterpriseAnalyticsEntity97> findByStatus(String status);
    List<EnterpriseAnalyticsEntity97> findByType(String type);
    List<EnterpriseAnalyticsEntity97> findByIsActiveTrue();
}
