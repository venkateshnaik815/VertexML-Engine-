package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity26;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity26Repository extends JpaRepository<EnterpriseAnalyticsEntity26, UUID> {
    List<EnterpriseAnalyticsEntity26> findByName(String name);
    List<EnterpriseAnalyticsEntity26> findByStatus(String status);
    List<EnterpriseAnalyticsEntity26> findByType(String type);
    List<EnterpriseAnalyticsEntity26> findByIsActiveTrue();
}
