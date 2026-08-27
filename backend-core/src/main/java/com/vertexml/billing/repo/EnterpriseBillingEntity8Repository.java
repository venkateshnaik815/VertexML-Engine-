package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity8;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity8Repository extends JpaRepository<EnterpriseBillingEntity8, UUID> {
    List<EnterpriseBillingEntity8> findByName(String name);
    List<EnterpriseBillingEntity8> findByStatus(String status);
    List<EnterpriseBillingEntity8> findByType(String type);
    List<EnterpriseBillingEntity8> findByIsActiveTrue();
}
