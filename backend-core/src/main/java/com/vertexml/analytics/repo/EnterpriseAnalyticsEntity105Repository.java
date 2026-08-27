package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity105;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity105Repository extends JpaRepository<EnterpriseAnalyticsEntity105, UUID> {
    List<EnterpriseAnalyticsEntity105> findByName(String name);
    List<EnterpriseAnalyticsEntity105> findByStatus(String status);
    List<EnterpriseAnalyticsEntity105> findByType(String type);
    List<EnterpriseAnalyticsEntity105> findByIsActiveTrue();
}
