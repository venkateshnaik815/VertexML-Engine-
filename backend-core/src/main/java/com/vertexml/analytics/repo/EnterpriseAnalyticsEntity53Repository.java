package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity53;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity53Repository extends JpaRepository<EnterpriseAnalyticsEntity53, UUID> {
    List<EnterpriseAnalyticsEntity53> findByName(String name);
    List<EnterpriseAnalyticsEntity53> findByStatus(String status);
    List<EnterpriseAnalyticsEntity53> findByType(String type);
    List<EnterpriseAnalyticsEntity53> findByIsActiveTrue();
}
