package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity56;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity56Repository extends JpaRepository<EnterpriseBillingEntity56, UUID> {
    List<EnterpriseBillingEntity56> findByName(String name);
    List<EnterpriseBillingEntity56> findByStatus(String status);
    List<EnterpriseBillingEntity56> findByType(String type);
    List<EnterpriseBillingEntity56> findByIsActiveTrue();
}
