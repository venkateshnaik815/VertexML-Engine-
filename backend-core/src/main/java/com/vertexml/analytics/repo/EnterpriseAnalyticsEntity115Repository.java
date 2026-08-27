package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity115;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity115Repository extends JpaRepository<EnterpriseAnalyticsEntity115, UUID> {
    List<EnterpriseAnalyticsEntity115> findByName(String name);
    List<EnterpriseAnalyticsEntity115> findByStatus(String status);
    List<EnterpriseAnalyticsEntity115> findByType(String type);
    List<EnterpriseAnalyticsEntity115> findByIsActiveTrue();
}
