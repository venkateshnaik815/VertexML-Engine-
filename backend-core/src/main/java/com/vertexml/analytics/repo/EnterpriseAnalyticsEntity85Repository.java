package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity85;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity85Repository extends JpaRepository<EnterpriseAnalyticsEntity85, UUID> {
    List<EnterpriseAnalyticsEntity85> findByName(String name);
    List<EnterpriseAnalyticsEntity85> findByStatus(String status);
    List<EnterpriseAnalyticsEntity85> findByType(String type);
    List<EnterpriseAnalyticsEntity85> findByIsActiveTrue();
}
