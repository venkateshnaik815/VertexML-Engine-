package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity4;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity4Repository extends JpaRepository<EnterpriseBillingEntity4, UUID> {
    List<EnterpriseBillingEntity4> findByName(String name);
    List<EnterpriseBillingEntity4> findByStatus(String status);
    List<EnterpriseBillingEntity4> findByType(String type);
    List<EnterpriseBillingEntity4> findByIsActiveTrue();
}
