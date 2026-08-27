package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity113;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity113Repository extends JpaRepository<EnterpriseBillingEntity113, UUID> {
    List<EnterpriseBillingEntity113> findByName(String name);
    List<EnterpriseBillingEntity113> findByStatus(String status);
    List<EnterpriseBillingEntity113> findByType(String type);
    List<EnterpriseBillingEntity113> findByIsActiveTrue();
}
