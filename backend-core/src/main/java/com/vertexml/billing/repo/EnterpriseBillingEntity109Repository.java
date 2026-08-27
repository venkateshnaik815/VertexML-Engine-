package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity109;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity109Repository extends JpaRepository<EnterpriseBillingEntity109, UUID> {
    List<EnterpriseBillingEntity109> findByName(String name);
    List<EnterpriseBillingEntity109> findByStatus(String status);
    List<EnterpriseBillingEntity109> findByType(String type);
    List<EnterpriseBillingEntity109> findByIsActiveTrue();
}
