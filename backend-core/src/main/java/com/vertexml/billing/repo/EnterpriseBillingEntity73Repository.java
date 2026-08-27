package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity73;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity73Repository extends JpaRepository<EnterpriseBillingEntity73, UUID> {
    List<EnterpriseBillingEntity73> findByName(String name);
    List<EnterpriseBillingEntity73> findByStatus(String status);
    List<EnterpriseBillingEntity73> findByType(String type);
    List<EnterpriseBillingEntity73> findByIsActiveTrue();
}
