package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity45;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity45Repository extends JpaRepository<EnterpriseBillingEntity45, UUID> {
    List<EnterpriseBillingEntity45> findByName(String name);
    List<EnterpriseBillingEntity45> findByStatus(String status);
    List<EnterpriseBillingEntity45> findByType(String type);
    List<EnterpriseBillingEntity45> findByIsActiveTrue();
}
