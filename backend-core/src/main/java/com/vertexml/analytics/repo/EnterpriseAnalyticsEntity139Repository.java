package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity139;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity139Repository extends JpaRepository<EnterpriseAnalyticsEntity139, UUID> {
    List<EnterpriseAnalyticsEntity139> findByName(String name);
    List<EnterpriseAnalyticsEntity139> findByStatus(String status);
    List<EnterpriseAnalyticsEntity139> findByType(String type);
    List<EnterpriseAnalyticsEntity139> findByIsActiveTrue();
}
