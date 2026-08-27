package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity6;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity6Repository extends JpaRepository<EnterpriseBillingEntity6, UUID> {
    List<EnterpriseBillingEntity6> findByName(String name);
    List<EnterpriseBillingEntity6> findByStatus(String status);
    List<EnterpriseBillingEntity6> findByType(String type);
    List<EnterpriseBillingEntity6> findByIsActiveTrue();
}
