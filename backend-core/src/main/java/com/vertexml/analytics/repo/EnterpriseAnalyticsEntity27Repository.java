package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity27;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity27Repository extends JpaRepository<EnterpriseAnalyticsEntity27, UUID> {
    List<EnterpriseAnalyticsEntity27> findByName(String name);
    List<EnterpriseAnalyticsEntity27> findByStatus(String status);
    List<EnterpriseAnalyticsEntity27> findByType(String type);
    List<EnterpriseAnalyticsEntity27> findByIsActiveTrue();
}
