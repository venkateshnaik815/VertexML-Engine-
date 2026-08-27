package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity32;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity32Repository extends JpaRepository<EnterpriseAnalyticsEntity32, UUID> {
    List<EnterpriseAnalyticsEntity32> findByName(String name);
    List<EnterpriseAnalyticsEntity32> findByStatus(String status);
    List<EnterpriseAnalyticsEntity32> findByType(String type);
    List<EnterpriseAnalyticsEntity32> findByIsActiveTrue();
}
