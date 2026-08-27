package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity148;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity148Repository extends JpaRepository<EnterpriseAnalyticsEntity148, UUID> {
    List<EnterpriseAnalyticsEntity148> findByName(String name);
    List<EnterpriseAnalyticsEntity148> findByStatus(String status);
    List<EnterpriseAnalyticsEntity148> findByType(String type);
    List<EnterpriseAnalyticsEntity148> findByIsActiveTrue();
}
