package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity17;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity17Repository extends JpaRepository<EnterpriseBillingEntity17, UUID> {
    List<EnterpriseBillingEntity17> findByName(String name);
    List<EnterpriseBillingEntity17> findByStatus(String status);
    List<EnterpriseBillingEntity17> findByType(String type);
    List<EnterpriseBillingEntity17> findByIsActiveTrue();
}
