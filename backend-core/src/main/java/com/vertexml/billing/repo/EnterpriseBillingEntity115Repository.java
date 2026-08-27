package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity115;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity115Repository extends JpaRepository<EnterpriseBillingEntity115, UUID> {
    List<EnterpriseBillingEntity115> findByName(String name);
    List<EnterpriseBillingEntity115> findByStatus(String status);
    List<EnterpriseBillingEntity115> findByType(String type);
    List<EnterpriseBillingEntity115> findByIsActiveTrue();
}
