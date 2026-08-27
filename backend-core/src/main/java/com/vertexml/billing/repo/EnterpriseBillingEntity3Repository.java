package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity3;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity3Repository extends JpaRepository<EnterpriseBillingEntity3, UUID> {
    List<EnterpriseBillingEntity3> findByName(String name);
    List<EnterpriseBillingEntity3> findByStatus(String status);
    List<EnterpriseBillingEntity3> findByType(String type);
    List<EnterpriseBillingEntity3> findByIsActiveTrue();
}
