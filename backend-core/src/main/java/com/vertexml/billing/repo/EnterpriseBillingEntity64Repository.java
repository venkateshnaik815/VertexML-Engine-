package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity64;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity64Repository extends JpaRepository<EnterpriseBillingEntity64, UUID> {
    List<EnterpriseBillingEntity64> findByName(String name);
    List<EnterpriseBillingEntity64> findByStatus(String status);
    List<EnterpriseBillingEntity64> findByType(String type);
    List<EnterpriseBillingEntity64> findByIsActiveTrue();
}
