package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity24;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity24Repository extends JpaRepository<EnterpriseBillingEntity24, UUID> {
    List<EnterpriseBillingEntity24> findByName(String name);
    List<EnterpriseBillingEntity24> findByStatus(String status);
    List<EnterpriseBillingEntity24> findByType(String type);
    List<EnterpriseBillingEntity24> findByIsActiveTrue();
}
