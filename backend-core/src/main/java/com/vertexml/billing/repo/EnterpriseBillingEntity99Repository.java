package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity99;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity99Repository extends JpaRepository<EnterpriseBillingEntity99, UUID> {
    List<EnterpriseBillingEntity99> findByName(String name);
    List<EnterpriseBillingEntity99> findByStatus(String status);
    List<EnterpriseBillingEntity99> findByType(String type);
    List<EnterpriseBillingEntity99> findByIsActiveTrue();
}
