package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity133;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity133Repository extends JpaRepository<EnterpriseBillingEntity133, UUID> {
    List<EnterpriseBillingEntity133> findByName(String name);
    List<EnterpriseBillingEntity133> findByStatus(String status);
    List<EnterpriseBillingEntity133> findByType(String type);
    List<EnterpriseBillingEntity133> findByIsActiveTrue();
}
