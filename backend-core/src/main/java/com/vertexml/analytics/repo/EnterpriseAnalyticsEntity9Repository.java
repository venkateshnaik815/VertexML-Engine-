package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity9;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity9Repository extends JpaRepository<EnterpriseAnalyticsEntity9, UUID> {
    List<EnterpriseAnalyticsEntity9> findByName(String name);
    List<EnterpriseAnalyticsEntity9> findByStatus(String status);
    List<EnterpriseAnalyticsEntity9> findByType(String type);
    List<EnterpriseAnalyticsEntity9> findByIsActiveTrue();
}
