package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity146;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity146Repository extends JpaRepository<EnterpriseBillingEntity146, UUID> {
    List<EnterpriseBillingEntity146> findByName(String name);
    List<EnterpriseBillingEntity146> findByStatus(String status);
    List<EnterpriseBillingEntity146> findByType(String type);
    List<EnterpriseBillingEntity146> findByIsActiveTrue();
}
