package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity60;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity60Repository extends JpaRepository<EnterpriseBillingEntity60, UUID> {
    List<EnterpriseBillingEntity60> findByName(String name);
    List<EnterpriseBillingEntity60> findByStatus(String status);
    List<EnterpriseBillingEntity60> findByType(String type);
    List<EnterpriseBillingEntity60> findByIsActiveTrue();
}
