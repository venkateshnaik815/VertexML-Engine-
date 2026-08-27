package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity20;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity20Repository extends JpaRepository<EnterpriseAnalyticsEntity20, UUID> {
    List<EnterpriseAnalyticsEntity20> findByName(String name);
    List<EnterpriseAnalyticsEntity20> findByStatus(String status);
    List<EnterpriseAnalyticsEntity20> findByType(String type);
    List<EnterpriseAnalyticsEntity20> findByIsActiveTrue();
}
