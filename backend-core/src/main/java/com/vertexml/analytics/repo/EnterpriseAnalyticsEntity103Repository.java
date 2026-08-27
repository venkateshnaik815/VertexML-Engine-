package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity103;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity103Repository extends JpaRepository<EnterpriseAnalyticsEntity103, UUID> {
    List<EnterpriseAnalyticsEntity103> findByName(String name);
    List<EnterpriseAnalyticsEntity103> findByStatus(String status);
    List<EnterpriseAnalyticsEntity103> findByType(String type);
    List<EnterpriseAnalyticsEntity103> findByIsActiveTrue();
}
