package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity116;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity116Repository extends JpaRepository<EnterpriseAnalyticsEntity116, UUID> {
    List<EnterpriseAnalyticsEntity116> findByName(String name);
    List<EnterpriseAnalyticsEntity116> findByStatus(String status);
    List<EnterpriseAnalyticsEntity116> findByType(String type);
    List<EnterpriseAnalyticsEntity116> findByIsActiveTrue();
}
