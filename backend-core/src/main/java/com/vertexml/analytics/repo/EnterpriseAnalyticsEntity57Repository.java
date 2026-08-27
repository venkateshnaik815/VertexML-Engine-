package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity57;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity57Repository extends JpaRepository<EnterpriseAnalyticsEntity57, UUID> {
    List<EnterpriseAnalyticsEntity57> findByName(String name);
    List<EnterpriseAnalyticsEntity57> findByStatus(String status);
    List<EnterpriseAnalyticsEntity57> findByType(String type);
    List<EnterpriseAnalyticsEntity57> findByIsActiveTrue();
}
