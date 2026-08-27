package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity10;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity10Repository extends JpaRepository<EnterpriseBillingEntity10, UUID> {
    List<EnterpriseBillingEntity10> findByName(String name);
    List<EnterpriseBillingEntity10> findByStatus(String status);
    List<EnterpriseBillingEntity10> findByType(String type);
    List<EnterpriseBillingEntity10> findByIsActiveTrue();
}
