package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity92;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity92Repository extends JpaRepository<EnterpriseBillingEntity92, UUID> {
    List<EnterpriseBillingEntity92> findByName(String name);
    List<EnterpriseBillingEntity92> findByStatus(String status);
    List<EnterpriseBillingEntity92> findByType(String type);
    List<EnterpriseBillingEntity92> findByIsActiveTrue();
}
