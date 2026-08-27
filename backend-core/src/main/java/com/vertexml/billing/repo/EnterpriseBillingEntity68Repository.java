package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity68;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity68Repository extends JpaRepository<EnterpriseBillingEntity68, UUID> {
    List<EnterpriseBillingEntity68> findByName(String name);
    List<EnterpriseBillingEntity68> findByStatus(String status);
    List<EnterpriseBillingEntity68> findByType(String type);
    List<EnterpriseBillingEntity68> findByIsActiveTrue();
}
