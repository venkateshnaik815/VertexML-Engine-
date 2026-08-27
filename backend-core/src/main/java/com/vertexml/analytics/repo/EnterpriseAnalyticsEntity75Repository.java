package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity75;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity75Repository extends JpaRepository<EnterpriseAnalyticsEntity75, UUID> {
    List<EnterpriseAnalyticsEntity75> findByName(String name);
    List<EnterpriseAnalyticsEntity75> findByStatus(String status);
    List<EnterpriseAnalyticsEntity75> findByType(String type);
    List<EnterpriseAnalyticsEntity75> findByIsActiveTrue();
}
