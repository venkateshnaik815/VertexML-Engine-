package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity33;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity33Repository extends JpaRepository<EnterpriseBillingEntity33, UUID> {
    List<EnterpriseBillingEntity33> findByName(String name);
    List<EnterpriseBillingEntity33> findByStatus(String status);
    List<EnterpriseBillingEntity33> findByType(String type);
    List<EnterpriseBillingEntity33> findByIsActiveTrue();
}
