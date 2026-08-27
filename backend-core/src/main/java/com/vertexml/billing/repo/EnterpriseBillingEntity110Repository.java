package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity110;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity110Repository extends JpaRepository<EnterpriseBillingEntity110, UUID> {
    List<EnterpriseBillingEntity110> findByName(String name);
    List<EnterpriseBillingEntity110> findByStatus(String status);
    List<EnterpriseBillingEntity110> findByType(String type);
    List<EnterpriseBillingEntity110> findByIsActiveTrue();
}
