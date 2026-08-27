package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity130;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity130Repository extends JpaRepository<EnterpriseAnalyticsEntity130, UUID> {
    List<EnterpriseAnalyticsEntity130> findByName(String name);
    List<EnterpriseAnalyticsEntity130> findByStatus(String status);
    List<EnterpriseAnalyticsEntity130> findByType(String type);
    List<EnterpriseAnalyticsEntity130> findByIsActiveTrue();
}
