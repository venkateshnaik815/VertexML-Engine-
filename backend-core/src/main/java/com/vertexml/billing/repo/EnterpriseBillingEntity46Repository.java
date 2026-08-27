package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity46;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity46Repository extends JpaRepository<EnterpriseBillingEntity46, UUID> {
    List<EnterpriseBillingEntity46> findByName(String name);
    List<EnterpriseBillingEntity46> findByStatus(String status);
    List<EnterpriseBillingEntity46> findByType(String type);
    List<EnterpriseBillingEntity46> findByIsActiveTrue();
}
