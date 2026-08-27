package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity141;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity141Repository extends JpaRepository<EnterpriseBillingEntity141, UUID> {
    List<EnterpriseBillingEntity141> findByName(String name);
    List<EnterpriseBillingEntity141> findByStatus(String status);
    List<EnterpriseBillingEntity141> findByType(String type);
    List<EnterpriseBillingEntity141> findByIsActiveTrue();
}
