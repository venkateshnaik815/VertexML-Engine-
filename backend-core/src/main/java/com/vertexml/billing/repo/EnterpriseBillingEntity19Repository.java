package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity19;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity19Repository extends JpaRepository<EnterpriseBillingEntity19, UUID> {
    List<EnterpriseBillingEntity19> findByName(String name);
    List<EnterpriseBillingEntity19> findByStatus(String status);
    List<EnterpriseBillingEntity19> findByType(String type);
    List<EnterpriseBillingEntity19> findByIsActiveTrue();
}
