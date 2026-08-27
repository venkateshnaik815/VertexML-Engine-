package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity44;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity44Repository extends JpaRepository<EnterpriseAnalyticsEntity44, UUID> {
    List<EnterpriseAnalyticsEntity44> findByName(String name);
    List<EnterpriseAnalyticsEntity44> findByStatus(String status);
    List<EnterpriseAnalyticsEntity44> findByType(String type);
    List<EnterpriseAnalyticsEntity44> findByIsActiveTrue();
}
