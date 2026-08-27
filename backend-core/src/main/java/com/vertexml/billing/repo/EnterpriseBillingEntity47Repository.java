package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity47;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity47Repository extends JpaRepository<EnterpriseBillingEntity47, UUID> {
    List<EnterpriseBillingEntity47> findByName(String name);
    List<EnterpriseBillingEntity47> findByStatus(String status);
    List<EnterpriseBillingEntity47> findByType(String type);
    List<EnterpriseBillingEntity47> findByIsActiveTrue();
}
