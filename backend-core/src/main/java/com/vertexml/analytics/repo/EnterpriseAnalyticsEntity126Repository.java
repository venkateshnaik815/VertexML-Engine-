package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity126;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity126Repository extends JpaRepository<EnterpriseAnalyticsEntity126, UUID> {
    List<EnterpriseAnalyticsEntity126> findByName(String name);
    List<EnterpriseAnalyticsEntity126> findByStatus(String status);
    List<EnterpriseAnalyticsEntity126> findByType(String type);
    List<EnterpriseAnalyticsEntity126> findByIsActiveTrue();
}
