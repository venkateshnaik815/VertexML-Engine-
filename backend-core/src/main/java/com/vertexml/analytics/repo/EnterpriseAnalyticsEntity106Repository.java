package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity106;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity106Repository extends JpaRepository<EnterpriseAnalyticsEntity106, UUID> {
    List<EnterpriseAnalyticsEntity106> findByName(String name);
    List<EnterpriseAnalyticsEntity106> findByStatus(String status);
    List<EnterpriseAnalyticsEntity106> findByType(String type);
    List<EnterpriseAnalyticsEntity106> findByIsActiveTrue();
}
