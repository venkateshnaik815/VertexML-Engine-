package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity67;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity67Repository extends JpaRepository<EnterpriseAnalyticsEntity67, UUID> {
    List<EnterpriseAnalyticsEntity67> findByName(String name);
    List<EnterpriseAnalyticsEntity67> findByStatus(String status);
    List<EnterpriseAnalyticsEntity67> findByType(String type);
    List<EnterpriseAnalyticsEntity67> findByIsActiveTrue();
}
