package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity123;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity123Repository extends JpaRepository<EnterpriseBillingEntity123, UUID> {
    List<EnterpriseBillingEntity123> findByName(String name);
    List<EnterpriseBillingEntity123> findByStatus(String status);
    List<EnterpriseBillingEntity123> findByType(String type);
    List<EnterpriseBillingEntity123> findByIsActiveTrue();
}
