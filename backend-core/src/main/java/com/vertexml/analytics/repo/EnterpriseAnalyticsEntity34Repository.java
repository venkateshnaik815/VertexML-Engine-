package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity34;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity34Repository extends JpaRepository<EnterpriseAnalyticsEntity34, UUID> {
    List<EnterpriseAnalyticsEntity34> findByName(String name);
    List<EnterpriseAnalyticsEntity34> findByStatus(String status);
    List<EnterpriseAnalyticsEntity34> findByType(String type);
    List<EnterpriseAnalyticsEntity34> findByIsActiveTrue();
}
