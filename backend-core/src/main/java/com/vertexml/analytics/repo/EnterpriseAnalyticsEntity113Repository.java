package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity113;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity113Repository extends JpaRepository<EnterpriseAnalyticsEntity113, UUID> {
    List<EnterpriseAnalyticsEntity113> findByName(String name);
    List<EnterpriseAnalyticsEntity113> findByStatus(String status);
    List<EnterpriseAnalyticsEntity113> findByType(String type);
    List<EnterpriseAnalyticsEntity113> findByIsActiveTrue();
}
