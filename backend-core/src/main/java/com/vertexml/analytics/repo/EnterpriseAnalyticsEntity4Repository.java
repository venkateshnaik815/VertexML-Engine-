package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity4;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity4Repository extends JpaRepository<EnterpriseAnalyticsEntity4, UUID> {
    List<EnterpriseAnalyticsEntity4> findByName(String name);
    List<EnterpriseAnalyticsEntity4> findByStatus(String status);
    List<EnterpriseAnalyticsEntity4> findByType(String type);
    List<EnterpriseAnalyticsEntity4> findByIsActiveTrue();
}
