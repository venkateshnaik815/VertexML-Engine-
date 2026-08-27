package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity63;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity63Repository extends JpaRepository<EnterpriseBillingEntity63, UUID> {
    List<EnterpriseBillingEntity63> findByName(String name);
    List<EnterpriseBillingEntity63> findByStatus(String status);
    List<EnterpriseBillingEntity63> findByType(String type);
    List<EnterpriseBillingEntity63> findByIsActiveTrue();
}
