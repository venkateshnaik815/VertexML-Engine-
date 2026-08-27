package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity43;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity43Repository extends JpaRepository<EnterpriseBillingEntity43, UUID> {
    List<EnterpriseBillingEntity43> findByName(String name);
    List<EnterpriseBillingEntity43> findByStatus(String status);
    List<EnterpriseBillingEntity43> findByType(String type);
    List<EnterpriseBillingEntity43> findByIsActiveTrue();
}
