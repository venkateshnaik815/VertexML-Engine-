package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity29;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity29Repository extends JpaRepository<EnterpriseBillingEntity29, UUID> {
    List<EnterpriseBillingEntity29> findByName(String name);
    List<EnterpriseBillingEntity29> findByStatus(String status);
    List<EnterpriseBillingEntity29> findByType(String type);
    List<EnterpriseBillingEntity29> findByIsActiveTrue();
}
