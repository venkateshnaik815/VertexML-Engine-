package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity74;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity74Repository extends JpaRepository<EnterpriseBillingEntity74, UUID> {
    List<EnterpriseBillingEntity74> findByName(String name);
    List<EnterpriseBillingEntity74> findByStatus(String status);
    List<EnterpriseBillingEntity74> findByType(String type);
    List<EnterpriseBillingEntity74> findByIsActiveTrue();
}
