package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity28;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity28Repository extends JpaRepository<EnterpriseAnalyticsEntity28, UUID> {
    List<EnterpriseAnalyticsEntity28> findByName(String name);
    List<EnterpriseAnalyticsEntity28> findByStatus(String status);
    List<EnterpriseAnalyticsEntity28> findByType(String type);
    List<EnterpriseAnalyticsEntity28> findByIsActiveTrue();
}
