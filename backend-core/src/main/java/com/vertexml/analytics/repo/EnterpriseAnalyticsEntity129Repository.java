package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity129;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity129Repository extends JpaRepository<EnterpriseAnalyticsEntity129, UUID> {
    List<EnterpriseAnalyticsEntity129> findByName(String name);
    List<EnterpriseAnalyticsEntity129> findByStatus(String status);
    List<EnterpriseAnalyticsEntity129> findByType(String type);
    List<EnterpriseAnalyticsEntity129> findByIsActiveTrue();
}
