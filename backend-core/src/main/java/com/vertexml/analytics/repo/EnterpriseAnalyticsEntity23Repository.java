package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity23;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity23Repository extends JpaRepository<EnterpriseAnalyticsEntity23, UUID> {
    List<EnterpriseAnalyticsEntity23> findByName(String name);
    List<EnterpriseAnalyticsEntity23> findByStatus(String status);
    List<EnterpriseAnalyticsEntity23> findByType(String type);
    List<EnterpriseAnalyticsEntity23> findByIsActiveTrue();
}
