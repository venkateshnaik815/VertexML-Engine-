package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity46;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity46Repository extends JpaRepository<EnterpriseAnalyticsEntity46, UUID> {
    List<EnterpriseAnalyticsEntity46> findByName(String name);
    List<EnterpriseAnalyticsEntity46> findByStatus(String status);
    List<EnterpriseAnalyticsEntity46> findByType(String type);
    List<EnterpriseAnalyticsEntity46> findByIsActiveTrue();
}
