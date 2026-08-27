package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity112;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity112Repository extends JpaRepository<EnterpriseAnalyticsEntity112, UUID> {
    List<EnterpriseAnalyticsEntity112> findByName(String name);
    List<EnterpriseAnalyticsEntity112> findByStatus(String status);
    List<EnterpriseAnalyticsEntity112> findByType(String type);
    List<EnterpriseAnalyticsEntity112> findByIsActiveTrue();
}
