package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity77;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity77Repository extends JpaRepository<EnterpriseBillingEntity77, UUID> {
    List<EnterpriseBillingEntity77> findByName(String name);
    List<EnterpriseBillingEntity77> findByStatus(String status);
    List<EnterpriseBillingEntity77> findByType(String type);
    List<EnterpriseBillingEntity77> findByIsActiveTrue();
}
