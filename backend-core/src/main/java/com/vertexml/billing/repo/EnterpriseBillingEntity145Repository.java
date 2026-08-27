package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity145;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity145Repository extends JpaRepository<EnterpriseBillingEntity145, UUID> {
    List<EnterpriseBillingEntity145> findByName(String name);
    List<EnterpriseBillingEntity145> findByStatus(String status);
    List<EnterpriseBillingEntity145> findByType(String type);
    List<EnterpriseBillingEntity145> findByIsActiveTrue();
}
