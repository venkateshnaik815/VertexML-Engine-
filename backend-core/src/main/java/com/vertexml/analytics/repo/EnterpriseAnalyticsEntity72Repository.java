package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity72;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity72Repository extends JpaRepository<EnterpriseAnalyticsEntity72, UUID> {
    List<EnterpriseAnalyticsEntity72> findByName(String name);
    List<EnterpriseAnalyticsEntity72> findByStatus(String status);
    List<EnterpriseAnalyticsEntity72> findByType(String type);
    List<EnterpriseAnalyticsEntity72> findByIsActiveTrue();
}
