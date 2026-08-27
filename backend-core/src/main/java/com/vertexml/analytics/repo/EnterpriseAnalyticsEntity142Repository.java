package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity142;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity142Repository extends JpaRepository<EnterpriseAnalyticsEntity142, UUID> {
    List<EnterpriseAnalyticsEntity142> findByName(String name);
    List<EnterpriseAnalyticsEntity142> findByStatus(String status);
    List<EnterpriseAnalyticsEntity142> findByType(String type);
    List<EnterpriseAnalyticsEntity142> findByIsActiveTrue();
}
