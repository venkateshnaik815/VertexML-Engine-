package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity93;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity93Repository extends JpaRepository<EnterpriseAnalyticsEntity93, UUID> {
    List<EnterpriseAnalyticsEntity93> findByName(String name);
    List<EnterpriseAnalyticsEntity93> findByStatus(String status);
    List<EnterpriseAnalyticsEntity93> findByType(String type);
    List<EnterpriseAnalyticsEntity93> findByIsActiveTrue();
}
