package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity61;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity61Repository extends JpaRepository<EnterpriseAnalyticsEntity61, UUID> {
    List<EnterpriseAnalyticsEntity61> findByName(String name);
    List<EnterpriseAnalyticsEntity61> findByStatus(String status);
    List<EnterpriseAnalyticsEntity61> findByType(String type);
    List<EnterpriseAnalyticsEntity61> findByIsActiveTrue();
}
