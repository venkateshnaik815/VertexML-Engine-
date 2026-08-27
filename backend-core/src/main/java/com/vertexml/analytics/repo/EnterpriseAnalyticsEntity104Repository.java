package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity104;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity104Repository extends JpaRepository<EnterpriseAnalyticsEntity104, UUID> {
    List<EnterpriseAnalyticsEntity104> findByName(String name);
    List<EnterpriseAnalyticsEntity104> findByStatus(String status);
    List<EnterpriseAnalyticsEntity104> findByType(String type);
    List<EnterpriseAnalyticsEntity104> findByIsActiveTrue();
}
