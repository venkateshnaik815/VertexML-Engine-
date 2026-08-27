package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity1;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity1Repository extends JpaRepository<EnterpriseAnalyticsEntity1, UUID> {
    List<EnterpriseAnalyticsEntity1> findByName(String name);
    List<EnterpriseAnalyticsEntity1> findByStatus(String status);
    List<EnterpriseAnalyticsEntity1> findByType(String type);
    List<EnterpriseAnalyticsEntity1> findByIsActiveTrue();
}
