package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity121;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity121Repository extends JpaRepository<EnterpriseAnalyticsEntity121, UUID> {
    List<EnterpriseAnalyticsEntity121> findByName(String name);
    List<EnterpriseAnalyticsEntity121> findByStatus(String status);
    List<EnterpriseAnalyticsEntity121> findByType(String type);
    List<EnterpriseAnalyticsEntity121> findByIsActiveTrue();
}
