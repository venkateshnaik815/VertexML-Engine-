package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity32;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity32Repository extends JpaRepository<EnterpriseBillingEntity32, UUID> {
    List<EnterpriseBillingEntity32> findByName(String name);
    List<EnterpriseBillingEntity32> findByStatus(String status);
    List<EnterpriseBillingEntity32> findByType(String type);
    List<EnterpriseBillingEntity32> findByIsActiveTrue();
}
