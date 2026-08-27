package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity93;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity93Repository extends JpaRepository<EnterpriseBillingEntity93, UUID> {
    List<EnterpriseBillingEntity93> findByName(String name);
    List<EnterpriseBillingEntity93> findByStatus(String status);
    List<EnterpriseBillingEntity93> findByType(String type);
    List<EnterpriseBillingEntity93> findByIsActiveTrue();
}
