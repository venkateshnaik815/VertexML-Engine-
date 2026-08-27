package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity125;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity125Repository extends JpaRepository<EnterpriseBillingEntity125, UUID> {
    List<EnterpriseBillingEntity125> findByName(String name);
    List<EnterpriseBillingEntity125> findByStatus(String status);
    List<EnterpriseBillingEntity125> findByType(String type);
    List<EnterpriseBillingEntity125> findByIsActiveTrue();
}
