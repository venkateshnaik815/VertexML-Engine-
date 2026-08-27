package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity101;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity101Repository extends JpaRepository<EnterpriseBillingEntity101, UUID> {
    List<EnterpriseBillingEntity101> findByName(String name);
    List<EnterpriseBillingEntity101> findByStatus(String status);
    List<EnterpriseBillingEntity101> findByType(String type);
    List<EnterpriseBillingEntity101> findByIsActiveTrue();
}
