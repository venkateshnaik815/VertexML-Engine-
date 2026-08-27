package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity108;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity108Repository extends JpaRepository<EnterpriseAnalyticsEntity108, UUID> {
    List<EnterpriseAnalyticsEntity108> findByName(String name);
    List<EnterpriseAnalyticsEntity108> findByStatus(String status);
    List<EnterpriseAnalyticsEntity108> findByType(String type);
    List<EnterpriseAnalyticsEntity108> findByIsActiveTrue();
}
