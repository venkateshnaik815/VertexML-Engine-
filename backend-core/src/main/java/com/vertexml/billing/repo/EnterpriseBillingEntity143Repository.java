package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity143;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity143Repository extends JpaRepository<EnterpriseBillingEntity143, UUID> {
    List<EnterpriseBillingEntity143> findByName(String name);
    List<EnterpriseBillingEntity143> findByStatus(String status);
    List<EnterpriseBillingEntity143> findByType(String type);
    List<EnterpriseBillingEntity143> findByIsActiveTrue();
}
