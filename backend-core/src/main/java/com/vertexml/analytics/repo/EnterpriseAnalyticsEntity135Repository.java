package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity135;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity135Repository extends JpaRepository<EnterpriseAnalyticsEntity135, UUID> {
    List<EnterpriseAnalyticsEntity135> findByName(String name);
    List<EnterpriseAnalyticsEntity135> findByStatus(String status);
    List<EnterpriseAnalyticsEntity135> findByType(String type);
    List<EnterpriseAnalyticsEntity135> findByIsActiveTrue();
}
