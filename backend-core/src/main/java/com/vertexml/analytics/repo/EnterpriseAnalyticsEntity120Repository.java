package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity120;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity120Repository extends JpaRepository<EnterpriseAnalyticsEntity120, UUID> {
    List<EnterpriseAnalyticsEntity120> findByName(String name);
    List<EnterpriseAnalyticsEntity120> findByStatus(String status);
    List<EnterpriseAnalyticsEntity120> findByType(String type);
    List<EnterpriseAnalyticsEntity120> findByIsActiveTrue();
}
