package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity132;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity132Repository extends JpaRepository<EnterpriseAnalyticsEntity132, UUID> {
    List<EnterpriseAnalyticsEntity132> findByName(String name);
    List<EnterpriseAnalyticsEntity132> findByStatus(String status);
    List<EnterpriseAnalyticsEntity132> findByType(String type);
    List<EnterpriseAnalyticsEntity132> findByIsActiveTrue();
}
