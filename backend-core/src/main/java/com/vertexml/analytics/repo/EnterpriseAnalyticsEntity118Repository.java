package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity118;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity118Repository extends JpaRepository<EnterpriseAnalyticsEntity118, UUID> {
    List<EnterpriseAnalyticsEntity118> findByName(String name);
    List<EnterpriseAnalyticsEntity118> findByStatus(String status);
    List<EnterpriseAnalyticsEntity118> findByType(String type);
    List<EnterpriseAnalyticsEntity118> findByIsActiveTrue();
}
