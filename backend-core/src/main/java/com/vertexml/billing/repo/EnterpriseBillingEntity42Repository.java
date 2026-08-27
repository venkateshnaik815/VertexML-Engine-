package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity42;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity42Repository extends JpaRepository<EnterpriseBillingEntity42, UUID> {
    List<EnterpriseBillingEntity42> findByName(String name);
    List<EnterpriseBillingEntity42> findByStatus(String status);
    List<EnterpriseBillingEntity42> findByType(String type);
    List<EnterpriseBillingEntity42> findByIsActiveTrue();
}
