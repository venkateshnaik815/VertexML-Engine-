package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity143;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity143Repository extends JpaRepository<EnterpriseAnalyticsEntity143, UUID> {
    List<EnterpriseAnalyticsEntity143> findByName(String name);
    List<EnterpriseAnalyticsEntity143> findByStatus(String status);
    List<EnterpriseAnalyticsEntity143> findByType(String type);
    List<EnterpriseAnalyticsEntity143> findByIsActiveTrue();
}
