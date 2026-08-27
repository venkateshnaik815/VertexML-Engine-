package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity7;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity7Repository extends JpaRepository<EnterpriseAnalyticsEntity7, UUID> {
    List<EnterpriseAnalyticsEntity7> findByName(String name);
    List<EnterpriseAnalyticsEntity7> findByStatus(String status);
    List<EnterpriseAnalyticsEntity7> findByType(String type);
    List<EnterpriseAnalyticsEntity7> findByIsActiveTrue();
}
