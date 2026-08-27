package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity15;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity15Repository extends JpaRepository<EnterpriseAnalyticsEntity15, UUID> {
    List<EnterpriseAnalyticsEntity15> findByName(String name);
    List<EnterpriseAnalyticsEntity15> findByStatus(String status);
    List<EnterpriseAnalyticsEntity15> findByType(String type);
    List<EnterpriseAnalyticsEntity15> findByIsActiveTrue();
}
