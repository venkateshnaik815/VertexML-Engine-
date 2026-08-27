package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity84;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity84Repository extends JpaRepository<EnterpriseBillingEntity84, UUID> {
    List<EnterpriseBillingEntity84> findByName(String name);
    List<EnterpriseBillingEntity84> findByStatus(String status);
    List<EnterpriseBillingEntity84> findByType(String type);
    List<EnterpriseBillingEntity84> findByIsActiveTrue();
}
