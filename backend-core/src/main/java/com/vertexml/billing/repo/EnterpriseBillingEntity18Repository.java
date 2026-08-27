package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity18;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity18Repository extends JpaRepository<EnterpriseBillingEntity18, UUID> {
    List<EnterpriseBillingEntity18> findByName(String name);
    List<EnterpriseBillingEntity18> findByStatus(String status);
    List<EnterpriseBillingEntity18> findByType(String type);
    List<EnterpriseBillingEntity18> findByIsActiveTrue();
}
