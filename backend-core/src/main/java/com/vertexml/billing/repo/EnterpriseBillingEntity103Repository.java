package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity103;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity103Repository extends JpaRepository<EnterpriseBillingEntity103, UUID> {
    List<EnterpriseBillingEntity103> findByName(String name);
    List<EnterpriseBillingEntity103> findByStatus(String status);
    List<EnterpriseBillingEntity103> findByType(String type);
    List<EnterpriseBillingEntity103> findByIsActiveTrue();
}
