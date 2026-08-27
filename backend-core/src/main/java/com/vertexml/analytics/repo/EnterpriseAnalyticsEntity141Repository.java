package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity141;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity141Repository extends JpaRepository<EnterpriseAnalyticsEntity141, UUID> {
    List<EnterpriseAnalyticsEntity141> findByName(String name);
    List<EnterpriseAnalyticsEntity141> findByStatus(String status);
    List<EnterpriseAnalyticsEntity141> findByType(String type);
    List<EnterpriseAnalyticsEntity141> findByIsActiveTrue();
}
