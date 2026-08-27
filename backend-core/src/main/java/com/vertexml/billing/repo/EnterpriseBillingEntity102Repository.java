package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity102;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity102Repository extends JpaRepository<EnterpriseBillingEntity102, UUID> {
    List<EnterpriseBillingEntity102> findByName(String name);
    List<EnterpriseBillingEntity102> findByStatus(String status);
    List<EnterpriseBillingEntity102> findByType(String type);
    List<EnterpriseBillingEntity102> findByIsActiveTrue();
}
