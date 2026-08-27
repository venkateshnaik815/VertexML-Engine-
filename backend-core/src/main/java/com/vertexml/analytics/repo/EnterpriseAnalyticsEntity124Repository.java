package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity124;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity124Repository extends JpaRepository<EnterpriseAnalyticsEntity124, UUID> {
    List<EnterpriseAnalyticsEntity124> findByName(String name);
    List<EnterpriseAnalyticsEntity124> findByStatus(String status);
    List<EnterpriseAnalyticsEntity124> findByType(String type);
    List<EnterpriseAnalyticsEntity124> findByIsActiveTrue();
}
