package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity87;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity87Repository extends JpaRepository<EnterpriseBillingEntity87, UUID> {
    List<EnterpriseBillingEntity87> findByName(String name);
    List<EnterpriseBillingEntity87> findByStatus(String status);
    List<EnterpriseBillingEntity87> findByType(String type);
    List<EnterpriseBillingEntity87> findByIsActiveTrue();
}
