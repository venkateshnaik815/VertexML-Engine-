package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity88;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity88Repository extends JpaRepository<EnterpriseAnalyticsEntity88, UUID> {
    List<EnterpriseAnalyticsEntity88> findByName(String name);
    List<EnterpriseAnalyticsEntity88> findByStatus(String status);
    List<EnterpriseAnalyticsEntity88> findByType(String type);
    List<EnterpriseAnalyticsEntity88> findByIsActiveTrue();
}
