package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity86;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity86Repository extends JpaRepository<EnterpriseAnalyticsEntity86, UUID> {
    List<EnterpriseAnalyticsEntity86> findByName(String name);
    List<EnterpriseAnalyticsEntity86> findByStatus(String status);
    List<EnterpriseAnalyticsEntity86> findByType(String type);
    List<EnterpriseAnalyticsEntity86> findByIsActiveTrue();
}
