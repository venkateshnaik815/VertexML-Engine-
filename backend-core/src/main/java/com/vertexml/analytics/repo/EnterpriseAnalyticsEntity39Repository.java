package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity39;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity39Repository extends JpaRepository<EnterpriseAnalyticsEntity39, UUID> {
    List<EnterpriseAnalyticsEntity39> findByName(String name);
    List<EnterpriseAnalyticsEntity39> findByStatus(String status);
    List<EnterpriseAnalyticsEntity39> findByType(String type);
    List<EnterpriseAnalyticsEntity39> findByIsActiveTrue();
}
