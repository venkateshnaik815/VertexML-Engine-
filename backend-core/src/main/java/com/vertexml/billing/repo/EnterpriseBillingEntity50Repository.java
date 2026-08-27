package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity50;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity50Repository extends JpaRepository<EnterpriseBillingEntity50, UUID> {
    List<EnterpriseBillingEntity50> findByName(String name);
    List<EnterpriseBillingEntity50> findByStatus(String status);
    List<EnterpriseBillingEntity50> findByType(String type);
    List<EnterpriseBillingEntity50> findByIsActiveTrue();
}
