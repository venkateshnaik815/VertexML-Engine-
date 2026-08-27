package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity71;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity71Repository extends JpaRepository<EnterpriseBillingEntity71, UUID> {
    List<EnterpriseBillingEntity71> findByName(String name);
    List<EnterpriseBillingEntity71> findByStatus(String status);
    List<EnterpriseBillingEntity71> findByType(String type);
    List<EnterpriseBillingEntity71> findByIsActiveTrue();
}
