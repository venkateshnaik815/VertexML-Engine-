package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity41;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity41Repository extends JpaRepository<EnterpriseAnalyticsEntity41, UUID> {
    List<EnterpriseAnalyticsEntity41> findByName(String name);
    List<EnterpriseAnalyticsEntity41> findByStatus(String status);
    List<EnterpriseAnalyticsEntity41> findByType(String type);
    List<EnterpriseAnalyticsEntity41> findByIsActiveTrue();
}
