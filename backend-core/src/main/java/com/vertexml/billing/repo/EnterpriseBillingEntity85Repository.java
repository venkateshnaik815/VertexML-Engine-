package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity85;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity85Repository extends JpaRepository<EnterpriseBillingEntity85, UUID> {
    List<EnterpriseBillingEntity85> findByName(String name);
    List<EnterpriseBillingEntity85> findByStatus(String status);
    List<EnterpriseBillingEntity85> findByType(String type);
    List<EnterpriseBillingEntity85> findByIsActiveTrue();
}
