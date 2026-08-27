package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity70;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity70Repository extends JpaRepository<EnterpriseAnalyticsEntity70, UUID> {
    List<EnterpriseAnalyticsEntity70> findByName(String name);
    List<EnterpriseAnalyticsEntity70> findByStatus(String status);
    List<EnterpriseAnalyticsEntity70> findByType(String type);
    List<EnterpriseAnalyticsEntity70> findByIsActiveTrue();
}
