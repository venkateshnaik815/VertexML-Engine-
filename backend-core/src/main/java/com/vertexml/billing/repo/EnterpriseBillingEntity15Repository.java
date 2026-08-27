package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity15;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity15Repository extends JpaRepository<EnterpriseBillingEntity15, UUID> {
    List<EnterpriseBillingEntity15> findByName(String name);
    List<EnterpriseBillingEntity15> findByStatus(String status);
    List<EnterpriseBillingEntity15> findByType(String type);
    List<EnterpriseBillingEntity15> findByIsActiveTrue();
}
