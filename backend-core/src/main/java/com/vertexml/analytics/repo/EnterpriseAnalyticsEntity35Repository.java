package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity35;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity35Repository extends JpaRepository<EnterpriseAnalyticsEntity35, UUID> {
    List<EnterpriseAnalyticsEntity35> findByName(String name);
    List<EnterpriseAnalyticsEntity35> findByStatus(String status);
    List<EnterpriseAnalyticsEntity35> findByType(String type);
    List<EnterpriseAnalyticsEntity35> findByIsActiveTrue();
}
