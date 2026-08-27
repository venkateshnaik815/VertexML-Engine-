package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity148;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity148Repository extends JpaRepository<EnterpriseBillingEntity148, UUID> {
    List<EnterpriseBillingEntity148> findByName(String name);
    List<EnterpriseBillingEntity148> findByStatus(String status);
    List<EnterpriseBillingEntity148> findByType(String type);
    List<EnterpriseBillingEntity148> findByIsActiveTrue();
}
