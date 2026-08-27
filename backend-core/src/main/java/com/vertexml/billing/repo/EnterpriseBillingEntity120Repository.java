package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity120;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity120Repository extends JpaRepository<EnterpriseBillingEntity120, UUID> {
    List<EnterpriseBillingEntity120> findByName(String name);
    List<EnterpriseBillingEntity120> findByStatus(String status);
    List<EnterpriseBillingEntity120> findByType(String type);
    List<EnterpriseBillingEntity120> findByIsActiveTrue();
}
