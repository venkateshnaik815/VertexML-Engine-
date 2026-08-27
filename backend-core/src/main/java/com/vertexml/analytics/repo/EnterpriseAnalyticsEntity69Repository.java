package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity69;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity69Repository extends JpaRepository<EnterpriseAnalyticsEntity69, UUID> {
    List<EnterpriseAnalyticsEntity69> findByName(String name);
    List<EnterpriseAnalyticsEntity69> findByStatus(String status);
    List<EnterpriseAnalyticsEntity69> findByType(String type);
    List<EnterpriseAnalyticsEntity69> findByIsActiveTrue();
}
