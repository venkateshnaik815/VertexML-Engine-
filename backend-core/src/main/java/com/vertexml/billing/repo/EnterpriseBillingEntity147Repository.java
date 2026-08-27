package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity147;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity147Repository extends JpaRepository<EnterpriseBillingEntity147, UUID> {
    List<EnterpriseBillingEntity147> findByName(String name);
    List<EnterpriseBillingEntity147> findByStatus(String status);
    List<EnterpriseBillingEntity147> findByType(String type);
    List<EnterpriseBillingEntity147> findByIsActiveTrue();
}
