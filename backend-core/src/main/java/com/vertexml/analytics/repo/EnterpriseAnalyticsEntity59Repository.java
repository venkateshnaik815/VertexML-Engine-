package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity59;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity59Repository extends JpaRepository<EnterpriseAnalyticsEntity59, UUID> {
    List<EnterpriseAnalyticsEntity59> findByName(String name);
    List<EnterpriseAnalyticsEntity59> findByStatus(String status);
    List<EnterpriseAnalyticsEntity59> findByType(String type);
    List<EnterpriseAnalyticsEntity59> findByIsActiveTrue();
}
