package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity61;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity61Repository extends JpaRepository<EnterpriseBillingEntity61, UUID> {
    List<EnterpriseBillingEntity61> findByName(String name);
    List<EnterpriseBillingEntity61> findByStatus(String status);
    List<EnterpriseBillingEntity61> findByType(String type);
    List<EnterpriseBillingEntity61> findByIsActiveTrue();
}
