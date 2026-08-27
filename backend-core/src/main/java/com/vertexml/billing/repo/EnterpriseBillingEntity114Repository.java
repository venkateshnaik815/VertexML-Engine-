package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity114;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity114Repository extends JpaRepository<EnterpriseBillingEntity114, UUID> {
    List<EnterpriseBillingEntity114> findByName(String name);
    List<EnterpriseBillingEntity114> findByStatus(String status);
    List<EnterpriseBillingEntity114> findByType(String type);
    List<EnterpriseBillingEntity114> findByIsActiveTrue();
}
