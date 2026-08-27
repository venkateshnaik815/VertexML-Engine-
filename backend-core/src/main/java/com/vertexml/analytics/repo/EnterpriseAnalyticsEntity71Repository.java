package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity71;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity71Repository extends JpaRepository<EnterpriseAnalyticsEntity71, UUID> {
    List<EnterpriseAnalyticsEntity71> findByName(String name);
    List<EnterpriseAnalyticsEntity71> findByStatus(String status);
    List<EnterpriseAnalyticsEntity71> findByType(String type);
    List<EnterpriseAnalyticsEntity71> findByIsActiveTrue();
}
