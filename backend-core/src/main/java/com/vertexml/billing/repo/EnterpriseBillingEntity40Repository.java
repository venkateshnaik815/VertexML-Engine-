package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity40;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity40Repository extends JpaRepository<EnterpriseBillingEntity40, UUID> {
    List<EnterpriseBillingEntity40> findByName(String name);
    List<EnterpriseBillingEntity40> findByStatus(String status);
    List<EnterpriseBillingEntity40> findByType(String type);
    List<EnterpriseBillingEntity40> findByIsActiveTrue();
}
