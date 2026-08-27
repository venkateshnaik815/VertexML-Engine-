package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity84;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity84Repository extends JpaRepository<EnterpriseAnalyticsEntity84, UUID> {
    List<EnterpriseAnalyticsEntity84> findByName(String name);
    List<EnterpriseAnalyticsEntity84> findByStatus(String status);
    List<EnterpriseAnalyticsEntity84> findByType(String type);
    List<EnterpriseAnalyticsEntity84> findByIsActiveTrue();
}
