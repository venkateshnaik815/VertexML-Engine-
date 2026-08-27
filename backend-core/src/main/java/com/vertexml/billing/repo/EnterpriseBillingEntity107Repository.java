package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity107;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity107Repository extends JpaRepository<EnterpriseBillingEntity107, UUID> {
    List<EnterpriseBillingEntity107> findByName(String name);
    List<EnterpriseBillingEntity107> findByStatus(String status);
    List<EnterpriseBillingEntity107> findByType(String type);
    List<EnterpriseBillingEntity107> findByIsActiveTrue();
}
