package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity142;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity142Repository extends JpaRepository<EnterpriseBillingEntity142, UUID> {
    List<EnterpriseBillingEntity142> findByName(String name);
    List<EnterpriseBillingEntity142> findByStatus(String status);
    List<EnterpriseBillingEntity142> findByType(String type);
    List<EnterpriseBillingEntity142> findByIsActiveTrue();
}
