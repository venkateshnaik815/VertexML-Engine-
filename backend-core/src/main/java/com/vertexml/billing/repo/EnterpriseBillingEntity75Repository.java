package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity75;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity75Repository extends JpaRepository<EnterpriseBillingEntity75, UUID> {
    List<EnterpriseBillingEntity75> findByName(String name);
    List<EnterpriseBillingEntity75> findByStatus(String status);
    List<EnterpriseBillingEntity75> findByType(String type);
    List<EnterpriseBillingEntity75> findByIsActiveTrue();
}
