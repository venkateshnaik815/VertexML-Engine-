package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity136;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity136Repository extends JpaRepository<EnterpriseAnalyticsEntity136, UUID> {
    List<EnterpriseAnalyticsEntity136> findByName(String name);
    List<EnterpriseAnalyticsEntity136> findByStatus(String status);
    List<EnterpriseAnalyticsEntity136> findByType(String type);
    List<EnterpriseAnalyticsEntity136> findByIsActiveTrue();
}
