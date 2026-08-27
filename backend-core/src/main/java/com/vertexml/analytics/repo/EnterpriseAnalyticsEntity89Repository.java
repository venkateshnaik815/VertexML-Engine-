package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity89;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity89Repository extends JpaRepository<EnterpriseAnalyticsEntity89, UUID> {
    List<EnterpriseAnalyticsEntity89> findByName(String name);
    List<EnterpriseAnalyticsEntity89> findByStatus(String status);
    List<EnterpriseAnalyticsEntity89> findByType(String type);
    List<EnterpriseAnalyticsEntity89> findByIsActiveTrue();
}
