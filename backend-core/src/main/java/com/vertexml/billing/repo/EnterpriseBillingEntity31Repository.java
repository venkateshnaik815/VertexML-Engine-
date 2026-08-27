package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity31;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity31Repository extends JpaRepository<EnterpriseBillingEntity31, UUID> {
    List<EnterpriseBillingEntity31> findByName(String name);
    List<EnterpriseBillingEntity31> findByStatus(String status);
    List<EnterpriseBillingEntity31> findByType(String type);
    List<EnterpriseBillingEntity31> findByIsActiveTrue();
}
