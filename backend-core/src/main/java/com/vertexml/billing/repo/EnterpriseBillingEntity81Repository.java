package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity81;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity81Repository extends JpaRepository<EnterpriseBillingEntity81, UUID> {
    List<EnterpriseBillingEntity81> findByName(String name);
    List<EnterpriseBillingEntity81> findByStatus(String status);
    List<EnterpriseBillingEntity81> findByType(String type);
    List<EnterpriseBillingEntity81> findByIsActiveTrue();
}
