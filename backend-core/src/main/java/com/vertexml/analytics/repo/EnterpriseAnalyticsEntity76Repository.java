package com.vertexml.analytics.repo;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity76;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseAnalyticsEntity76Repository extends JpaRepository<EnterpriseAnalyticsEntity76, UUID> {
    List<EnterpriseAnalyticsEntity76> findByName(String name);
    List<EnterpriseAnalyticsEntity76> findByStatus(String status);
    List<EnterpriseAnalyticsEntity76> findByType(String type);
    List<EnterpriseAnalyticsEntity76> findByIsActiveTrue();
}
