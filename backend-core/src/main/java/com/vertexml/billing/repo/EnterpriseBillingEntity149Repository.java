package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity149;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity149Repository extends JpaRepository<EnterpriseBillingEntity149, UUID> {
    List<EnterpriseBillingEntity149> findByName(String name);
    List<EnterpriseBillingEntity149> findByStatus(String status);
    List<EnterpriseBillingEntity149> findByType(String type);
    List<EnterpriseBillingEntity149> findByIsActiveTrue();
}
