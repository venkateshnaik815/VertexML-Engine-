package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity54;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity54Repository extends JpaRepository<EnterpriseBillingEntity54, UUID> {
    List<EnterpriseBillingEntity54> findByName(String name);
    List<EnterpriseBillingEntity54> findByStatus(String status);
    List<EnterpriseBillingEntity54> findByType(String type);
    List<EnterpriseBillingEntity54> findByIsActiveTrue();
}
