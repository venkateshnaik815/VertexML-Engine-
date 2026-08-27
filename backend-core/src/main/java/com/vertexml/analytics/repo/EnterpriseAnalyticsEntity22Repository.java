package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity22;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity22Repository extends JpaRepository<EnterpriseAnalyticsEntity22, UUID> {
    List<EnterpriseAnalyticsEntity22> findByName(String name);
    List<EnterpriseAnalyticsEntity22> findByStatus(String status);
    List<EnterpriseAnalyticsEntity22> findByType(String type);
    List<EnterpriseAnalyticsEntity22> findByIsActiveTrue();
}
