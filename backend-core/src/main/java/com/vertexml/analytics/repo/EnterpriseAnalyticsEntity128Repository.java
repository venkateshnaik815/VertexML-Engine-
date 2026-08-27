package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity128;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity128Repository extends JpaRepository<EnterpriseAnalyticsEntity128, UUID> {
    List<EnterpriseAnalyticsEntity128> findByName(String name);
    List<EnterpriseAnalyticsEntity128> findByStatus(String status);
    List<EnterpriseAnalyticsEntity128> findByType(String type);
    List<EnterpriseAnalyticsEntity128> findByIsActiveTrue();
}
