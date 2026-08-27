package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity37;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity37Repository extends JpaRepository<EnterpriseAnalyticsEntity37, UUID> {
    List<EnterpriseAnalyticsEntity37> findByName(String name);
    List<EnterpriseAnalyticsEntity37> findByStatus(String status);
    List<EnterpriseAnalyticsEntity37> findByType(String type);
    List<EnterpriseAnalyticsEntity37> findByIsActiveTrue();
}
