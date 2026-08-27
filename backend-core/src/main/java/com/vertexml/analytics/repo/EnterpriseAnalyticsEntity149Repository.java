package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity149;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity149Repository extends JpaRepository<EnterpriseAnalyticsEntity149, UUID> {
    List<EnterpriseAnalyticsEntity149> findByName(String name);
    List<EnterpriseAnalyticsEntity149> findByStatus(String status);
    List<EnterpriseAnalyticsEntity149> findByType(String type);
    List<EnterpriseAnalyticsEntity149> findByIsActiveTrue();
}
