package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity35;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity35Repository extends JpaRepository<EnterpriseBillingEntity35, UUID> {
    List<EnterpriseBillingEntity35> findByName(String name);
    List<EnterpriseBillingEntity35> findByStatus(String status);
    List<EnterpriseBillingEntity35> findByType(String type);
    List<EnterpriseBillingEntity35> findByIsActiveTrue();
}
