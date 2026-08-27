package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity13;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity13Repository extends JpaRepository<EnterpriseAnalyticsEntity13, UUID> {
    List<EnterpriseAnalyticsEntity13> findByName(String name);
    List<EnterpriseAnalyticsEntity13> findByStatus(String status);
    List<EnterpriseAnalyticsEntity13> findByType(String type);
    List<EnterpriseAnalyticsEntity13> findByIsActiveTrue();
}
