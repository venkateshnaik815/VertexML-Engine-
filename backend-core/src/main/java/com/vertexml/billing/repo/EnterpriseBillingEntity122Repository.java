package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity122;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity122Repository extends JpaRepository<EnterpriseBillingEntity122, UUID> {
    List<EnterpriseBillingEntity122> findByName(String name);
    List<EnterpriseBillingEntity122> findByStatus(String status);
    List<EnterpriseBillingEntity122> findByType(String type);
    List<EnterpriseBillingEntity122> findByIsActiveTrue();
}
