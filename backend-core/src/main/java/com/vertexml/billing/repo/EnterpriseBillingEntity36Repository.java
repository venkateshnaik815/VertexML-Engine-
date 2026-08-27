package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity36;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity36Repository extends JpaRepository<EnterpriseBillingEntity36, UUID> {
    List<EnterpriseBillingEntity36> findByName(String name);
    List<EnterpriseBillingEntity36> findByStatus(String status);
    List<EnterpriseBillingEntity36> findByType(String type);
    List<EnterpriseBillingEntity36> findByIsActiveTrue();
}
