package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity98;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity98Repository extends JpaRepository<EnterpriseAnalyticsEntity98, UUID> {
    List<EnterpriseAnalyticsEntity98> findByName(String name);
    List<EnterpriseAnalyticsEntity98> findByStatus(String status);
    List<EnterpriseAnalyticsEntity98> findByType(String type);
    List<EnterpriseAnalyticsEntity98> findByIsActiveTrue();
}
