package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity78;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity78Repository extends JpaRepository<EnterpriseBillingEntity78, UUID> {
    List<EnterpriseBillingEntity78> findByName(String name);
    List<EnterpriseBillingEntity78> findByStatus(String status);
    List<EnterpriseBillingEntity78> findByType(String type);
    List<EnterpriseBillingEntity78> findByIsActiveTrue();
}
