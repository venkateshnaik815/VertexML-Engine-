package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity21;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity21Repository extends JpaRepository<EnterpriseBillingEntity21, UUID> {
    List<EnterpriseBillingEntity21> findByName(String name);
    List<EnterpriseBillingEntity21> findByStatus(String status);
    List<EnterpriseBillingEntity21> findByType(String type);
    List<EnterpriseBillingEntity21> findByIsActiveTrue();
}
