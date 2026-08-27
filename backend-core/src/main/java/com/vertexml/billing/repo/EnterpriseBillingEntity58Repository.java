package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity58;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity58Repository extends JpaRepository<EnterpriseBillingEntity58, UUID> {
    List<EnterpriseBillingEntity58> findByName(String name);
    List<EnterpriseBillingEntity58> findByStatus(String status);
    List<EnterpriseBillingEntity58> findByType(String type);
    List<EnterpriseBillingEntity58> findByIsActiveTrue();
}
