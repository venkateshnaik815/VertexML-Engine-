package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity2;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity2Repository extends JpaRepository<EnterpriseBillingEntity2, UUID> {
    List<EnterpriseBillingEntity2> findByName(String name);
    List<EnterpriseBillingEntity2> findByStatus(String status);
    List<EnterpriseBillingEntity2> findByType(String type);
    List<EnterpriseBillingEntity2> findByIsActiveTrue();
}
