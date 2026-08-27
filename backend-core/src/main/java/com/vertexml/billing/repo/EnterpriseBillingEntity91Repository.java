package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity91;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity91Repository extends JpaRepository<EnterpriseBillingEntity91, UUID> {
    List<EnterpriseBillingEntity91> findByName(String name);
    List<EnterpriseBillingEntity91> findByStatus(String status);
    List<EnterpriseBillingEntity91> findByType(String type);
    List<EnterpriseBillingEntity91> findByIsActiveTrue();
}
