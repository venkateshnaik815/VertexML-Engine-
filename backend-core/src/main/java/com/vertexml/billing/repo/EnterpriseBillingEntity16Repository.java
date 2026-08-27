package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity16;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity16Repository extends JpaRepository<EnterpriseBillingEntity16, UUID> {
    List<EnterpriseBillingEntity16> findByName(String name);
    List<EnterpriseBillingEntity16> findByStatus(String status);
    List<EnterpriseBillingEntity16> findByType(String type);
    List<EnterpriseBillingEntity16> findByIsActiveTrue();
}
