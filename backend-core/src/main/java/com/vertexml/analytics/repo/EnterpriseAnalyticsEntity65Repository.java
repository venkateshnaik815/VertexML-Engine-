package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity65;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity65Repository extends JpaRepository<EnterpriseAnalyticsEntity65, UUID> {
    List<EnterpriseAnalyticsEntity65> findByName(String name);
    List<EnterpriseAnalyticsEntity65> findByStatus(String status);
    List<EnterpriseAnalyticsEntity65> findByType(String type);
    List<EnterpriseAnalyticsEntity65> findByIsActiveTrue();
}
