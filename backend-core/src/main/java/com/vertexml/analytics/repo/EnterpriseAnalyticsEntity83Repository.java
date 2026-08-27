package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity83;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity83Repository extends JpaRepository<EnterpriseAnalyticsEntity83, UUID> {
    List<EnterpriseAnalyticsEntity83> findByName(String name);
    List<EnterpriseAnalyticsEntity83> findByStatus(String status);
    List<EnterpriseAnalyticsEntity83> findByType(String type);
    List<EnterpriseAnalyticsEntity83> findByIsActiveTrue();
}
