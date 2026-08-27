package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity62;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity62Repository extends JpaRepository<EnterpriseAnalyticsEntity62, UUID> {
    List<EnterpriseAnalyticsEntity62> findByName(String name);
    List<EnterpriseAnalyticsEntity62> findByStatus(String status);
    List<EnterpriseAnalyticsEntity62> findByType(String type);
    List<EnterpriseAnalyticsEntity62> findByIsActiveTrue();
}
