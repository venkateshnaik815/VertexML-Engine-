package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity11;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity11Repository extends JpaRepository<EnterpriseAnalyticsEntity11, UUID> {
    List<EnterpriseAnalyticsEntity11> findByName(String name);
    List<EnterpriseAnalyticsEntity11> findByStatus(String status);
    List<EnterpriseAnalyticsEntity11> findByType(String type);
    List<EnterpriseAnalyticsEntity11> findByIsActiveTrue();
}
