package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity97;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity97Repository extends JpaRepository<EnterpriseBillingEntity97, UUID> {
    List<EnterpriseBillingEntity97> findByName(String name);
    List<EnterpriseBillingEntity97> findByStatus(String status);
    List<EnterpriseBillingEntity97> findByType(String type);
    List<EnterpriseBillingEntity97> findByIsActiveTrue();
}
