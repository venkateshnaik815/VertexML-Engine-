package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity5;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity5Repository extends JpaRepository<EnterpriseAnalyticsEntity5, UUID> {
    List<EnterpriseAnalyticsEntity5> findByName(String name);
    List<EnterpriseAnalyticsEntity5> findByStatus(String status);
    List<EnterpriseAnalyticsEntity5> findByType(String type);
    List<EnterpriseAnalyticsEntity5> findByIsActiveTrue();
}
