package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity134;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity134Repository extends JpaRepository<EnterpriseAnalyticsEntity134, UUID> {
    List<EnterpriseAnalyticsEntity134> findByName(String name);
    List<EnterpriseAnalyticsEntity134> findByStatus(String status);
    List<EnterpriseAnalyticsEntity134> findByType(String type);
    List<EnterpriseAnalyticsEntity134> findByIsActiveTrue();
}
