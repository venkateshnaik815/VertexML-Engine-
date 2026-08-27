package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity14;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity14Repository extends JpaRepository<EnterpriseBillingEntity14, UUID> {
    List<EnterpriseBillingEntity14> findByName(String name);
    List<EnterpriseBillingEntity14> findByStatus(String status);
    List<EnterpriseBillingEntity14> findByType(String type);
    List<EnterpriseBillingEntity14> findByIsActiveTrue();
}
