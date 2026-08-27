package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity127;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity127Repository extends JpaRepository<EnterpriseAnalyticsEntity127, UUID> {
    List<EnterpriseAnalyticsEntity127> findByName(String name);
    List<EnterpriseAnalyticsEntity127> findByStatus(String status);
    List<EnterpriseAnalyticsEntity127> findByType(String type);
    List<EnterpriseAnalyticsEntity127> findByIsActiveTrue();
}
