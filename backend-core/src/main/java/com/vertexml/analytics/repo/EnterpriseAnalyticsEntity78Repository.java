package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity78;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity78Repository extends JpaRepository<EnterpriseAnalyticsEntity78, UUID> {
    List<EnterpriseAnalyticsEntity78> findByName(String name);
    List<EnterpriseAnalyticsEntity78> findByStatus(String status);
    List<EnterpriseAnalyticsEntity78> findByType(String type);
    List<EnterpriseAnalyticsEntity78> findByIsActiveTrue();
}
