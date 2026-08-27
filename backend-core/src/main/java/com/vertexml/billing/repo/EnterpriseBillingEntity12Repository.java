package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity12;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity12Repository extends JpaRepository<EnterpriseBillingEntity12, UUID> {
    List<EnterpriseBillingEntity12> findByName(String name);
    List<EnterpriseBillingEntity12> findByStatus(String status);
    List<EnterpriseBillingEntity12> findByType(String type);
    List<EnterpriseBillingEntity12> findByIsActiveTrue();
}
