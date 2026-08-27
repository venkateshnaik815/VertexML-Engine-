package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity114;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity114Repository extends JpaRepository<EnterpriseAnalyticsEntity114, UUID> {
    List<EnterpriseAnalyticsEntity114> findByName(String name);
    List<EnterpriseAnalyticsEntity114> findByStatus(String status);
    List<EnterpriseAnalyticsEntity114> findByType(String type);
    List<EnterpriseAnalyticsEntity114> findByIsActiveTrue();
}
