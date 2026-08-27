package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity30;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity30Repository extends JpaRepository<EnterpriseBillingEntity30, UUID> {
    List<EnterpriseBillingEntity30> findByName(String name);
    List<EnterpriseBillingEntity30> findByStatus(String status);
    List<EnterpriseBillingEntity30> findByType(String type);
    List<EnterpriseBillingEntity30> findByIsActiveTrue();
}
