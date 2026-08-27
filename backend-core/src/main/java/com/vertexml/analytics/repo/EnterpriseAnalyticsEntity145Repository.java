package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity145;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity145Repository extends JpaRepository<EnterpriseAnalyticsEntity145, UUID> {
    List<EnterpriseAnalyticsEntity145> findByName(String name);
    List<EnterpriseAnalyticsEntity145> findByStatus(String status);
    List<EnterpriseAnalyticsEntity145> findByType(String type);
    List<EnterpriseAnalyticsEntity145> findByIsActiveTrue();
}
