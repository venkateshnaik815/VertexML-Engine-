package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity47;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity47Repository extends JpaRepository<EnterpriseAnalyticsEntity47, UUID> {
    List<EnterpriseAnalyticsEntity47> findByName(String name);
    List<EnterpriseAnalyticsEntity47> findByStatus(String status);
    List<EnterpriseAnalyticsEntity47> findByType(String type);
    List<EnterpriseAnalyticsEntity47> findByIsActiveTrue();
}
