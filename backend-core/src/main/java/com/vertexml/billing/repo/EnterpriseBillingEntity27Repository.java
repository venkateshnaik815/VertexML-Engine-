package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity27;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity27Repository extends JpaRepository<EnterpriseBillingEntity27, UUID> {
    List<EnterpriseBillingEntity27> findByName(String name);
    List<EnterpriseBillingEntity27> findByStatus(String status);
    List<EnterpriseBillingEntity27> findByType(String type);
    List<EnterpriseBillingEntity27> findByIsActiveTrue();
}
