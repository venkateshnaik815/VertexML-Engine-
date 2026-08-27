package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity80;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity80Repository extends JpaRepository<EnterpriseBillingEntity80, UUID> {
    List<EnterpriseBillingEntity80> findByName(String name);
    List<EnterpriseBillingEntity80> findByStatus(String status);
    List<EnterpriseBillingEntity80> findByType(String type);
    List<EnterpriseBillingEntity80> findByIsActiveTrue();
}
