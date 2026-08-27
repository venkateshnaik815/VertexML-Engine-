package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity79;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity79Repository extends JpaRepository<EnterpriseAnalyticsEntity79, UUID> {
    List<EnterpriseAnalyticsEntity79> findByName(String name);
    List<EnterpriseAnalyticsEntity79> findByStatus(String status);
    List<EnterpriseAnalyticsEntity79> findByType(String type);
    List<EnterpriseAnalyticsEntity79> findByIsActiveTrue();
}
