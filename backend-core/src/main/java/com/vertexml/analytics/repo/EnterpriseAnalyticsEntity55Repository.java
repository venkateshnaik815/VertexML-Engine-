package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity55;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity55Repository extends JpaRepository<EnterpriseAnalyticsEntity55, UUID> {
    List<EnterpriseAnalyticsEntity55> findByName(String name);
    List<EnterpriseAnalyticsEntity55> findByStatus(String status);
    List<EnterpriseAnalyticsEntity55> findByType(String type);
    List<EnterpriseAnalyticsEntity55> findByIsActiveTrue();
}
