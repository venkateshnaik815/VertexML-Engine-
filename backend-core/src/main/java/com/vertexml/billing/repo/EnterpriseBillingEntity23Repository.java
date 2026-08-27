package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity23;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity23Repository extends JpaRepository<EnterpriseBillingEntity23, UUID> {
    List<EnterpriseBillingEntity23> findByName(String name);
    List<EnterpriseBillingEntity23> findByStatus(String status);
    List<EnterpriseBillingEntity23> findByType(String type);
    List<EnterpriseBillingEntity23> findByIsActiveTrue();
}
