package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity66;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity66Repository extends JpaRepository<EnterpriseAnalyticsEntity66, UUID> {
    List<EnterpriseAnalyticsEntity66> findByName(String name);
    List<EnterpriseAnalyticsEntity66> findByStatus(String status);
    List<EnterpriseAnalyticsEntity66> findByType(String type);
    List<EnterpriseAnalyticsEntity66> findByIsActiveTrue();
}
