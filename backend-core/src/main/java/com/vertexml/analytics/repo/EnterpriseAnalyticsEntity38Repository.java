package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity38;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity38Repository extends JpaRepository<EnterpriseAnalyticsEntity38, UUID> {
    List<EnterpriseAnalyticsEntity38> findByName(String name);
    List<EnterpriseAnalyticsEntity38> findByStatus(String status);
    List<EnterpriseAnalyticsEntity38> findByType(String type);
    List<EnterpriseAnalyticsEntity38> findByIsActiveTrue();
}
