package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity70;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity70Repository extends JpaRepository<EnterpriseBillingEntity70, UUID> {
    List<EnterpriseBillingEntity70> findByName(String name);
    List<EnterpriseBillingEntity70> findByStatus(String status);
    List<EnterpriseBillingEntity70> findByType(String type);
    List<EnterpriseBillingEntity70> findByIsActiveTrue();
}
