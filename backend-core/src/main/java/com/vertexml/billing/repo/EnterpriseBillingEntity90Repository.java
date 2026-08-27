package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity90;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity90Repository extends JpaRepository<EnterpriseBillingEntity90, UUID> {
    List<EnterpriseBillingEntity90> findByName(String name);
    List<EnterpriseBillingEntity90> findByStatus(String status);
    List<EnterpriseBillingEntity90> findByType(String type);
    List<EnterpriseBillingEntity90> findByIsActiveTrue();
}
