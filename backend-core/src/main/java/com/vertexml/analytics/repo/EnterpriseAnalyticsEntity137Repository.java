package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity137;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity137Repository extends JpaRepository<EnterpriseAnalyticsEntity137, UUID> {
    List<EnterpriseAnalyticsEntity137> findByName(String name);
    List<EnterpriseAnalyticsEntity137> findByStatus(String status);
    List<EnterpriseAnalyticsEntity137> findByType(String type);
    List<EnterpriseAnalyticsEntity137> findByIsActiveTrue();
}
