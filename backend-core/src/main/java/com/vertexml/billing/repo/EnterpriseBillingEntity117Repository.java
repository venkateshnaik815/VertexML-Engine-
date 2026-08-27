package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity117;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity117Repository extends JpaRepository<EnterpriseBillingEntity117, UUID> {
    List<EnterpriseBillingEntity117> findByName(String name);
    List<EnterpriseBillingEntity117> findByStatus(String status);
    List<EnterpriseBillingEntity117> findByType(String type);
    List<EnterpriseBillingEntity117> findByIsActiveTrue();
}
