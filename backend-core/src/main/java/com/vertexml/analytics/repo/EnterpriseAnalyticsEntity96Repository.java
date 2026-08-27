package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity96;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity96Repository extends JpaRepository<EnterpriseAnalyticsEntity96, UUID> {
    List<EnterpriseAnalyticsEntity96> findByName(String name);
    List<EnterpriseAnalyticsEntity96> findByStatus(String status);
    List<EnterpriseAnalyticsEntity96> findByType(String type);
    List<EnterpriseAnalyticsEntity96> findByIsActiveTrue();
}
