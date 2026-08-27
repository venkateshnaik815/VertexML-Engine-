package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity37;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity37Repository extends JpaRepository<EnterpriseBillingEntity37, UUID> {
    List<EnterpriseBillingEntity37> findByName(String name);
    List<EnterpriseBillingEntity37> findByStatus(String status);
    List<EnterpriseBillingEntity37> findByType(String type);
    List<EnterpriseBillingEntity37> findByIsActiveTrue();
}
