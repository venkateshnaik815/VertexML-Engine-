package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity52;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity52Repository extends JpaRepository<EnterpriseBillingEntity52, UUID> {
    List<EnterpriseBillingEntity52> findByName(String name);
    List<EnterpriseBillingEntity52> findByStatus(String status);
    List<EnterpriseBillingEntity52> findByType(String type);
    List<EnterpriseBillingEntity52> findByIsActiveTrue();
}
