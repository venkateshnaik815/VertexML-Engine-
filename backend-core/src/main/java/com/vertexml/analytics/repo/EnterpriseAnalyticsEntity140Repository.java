package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity140;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity140Repository extends JpaRepository<EnterpriseAnalyticsEntity140, UUID> {
    List<EnterpriseAnalyticsEntity140> findByName(String name);
    List<EnterpriseAnalyticsEntity140> findByStatus(String status);
    List<EnterpriseAnalyticsEntity140> findByType(String type);
    List<EnterpriseAnalyticsEntity140> findByIsActiveTrue();
}
