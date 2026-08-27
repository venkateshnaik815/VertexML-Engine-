package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity138;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity138Repository extends JpaRepository<EnterpriseAnalyticsEntity138, UUID> {
    List<EnterpriseAnalyticsEntity138> findByName(String name);
    List<EnterpriseAnalyticsEntity138> findByStatus(String status);
    List<EnterpriseAnalyticsEntity138> findByType(String type);
    List<EnterpriseAnalyticsEntity138> findByIsActiveTrue();
}
