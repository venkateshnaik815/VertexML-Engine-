package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity95;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity95Repository extends JpaRepository<EnterpriseBillingEntity95, UUID> {
    List<EnterpriseBillingEntity95> findByName(String name);
    List<EnterpriseBillingEntity95> findByStatus(String status);
    List<EnterpriseBillingEntity95> findByType(String type);
    List<EnterpriseBillingEntity95> findByIsActiveTrue();
}
