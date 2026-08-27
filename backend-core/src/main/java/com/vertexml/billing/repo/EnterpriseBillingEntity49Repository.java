package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity49;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity49Repository extends JpaRepository<EnterpriseBillingEntity49, UUID> {
    List<EnterpriseBillingEntity49> findByName(String name);
    List<EnterpriseBillingEntity49> findByStatus(String status);
    List<EnterpriseBillingEntity49> findByType(String type);
    List<EnterpriseBillingEntity49> findByIsActiveTrue();
}
