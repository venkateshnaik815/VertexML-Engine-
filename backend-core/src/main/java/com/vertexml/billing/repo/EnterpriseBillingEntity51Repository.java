package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity51;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity51Repository extends JpaRepository<EnterpriseBillingEntity51, UUID> {
    List<EnterpriseBillingEntity51> findByName(String name);
    List<EnterpriseBillingEntity51> findByStatus(String status);
    List<EnterpriseBillingEntity51> findByType(String type);
    List<EnterpriseBillingEntity51> findByIsActiveTrue();
}
