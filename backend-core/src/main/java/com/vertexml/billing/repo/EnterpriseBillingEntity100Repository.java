package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity100;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity100Repository extends JpaRepository<EnterpriseBillingEntity100, UUID> {
    List<EnterpriseBillingEntity100> findByName(String name);
    List<EnterpriseBillingEntity100> findByStatus(String status);
    List<EnterpriseBillingEntity100> findByType(String type);
    List<EnterpriseBillingEntity100> findByIsActiveTrue();
}
