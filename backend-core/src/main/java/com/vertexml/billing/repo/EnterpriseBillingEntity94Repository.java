package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity94;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity94Repository extends JpaRepository<EnterpriseBillingEntity94, UUID> {
    List<EnterpriseBillingEntity94> findByName(String name);
    List<EnterpriseBillingEntity94> findByStatus(String status);
    List<EnterpriseBillingEntity94> findByType(String type);
    List<EnterpriseBillingEntity94> findByIsActiveTrue();
}
