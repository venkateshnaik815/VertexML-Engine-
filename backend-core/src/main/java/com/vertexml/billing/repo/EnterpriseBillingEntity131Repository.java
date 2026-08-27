package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity131;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity131Repository extends JpaRepository<EnterpriseBillingEntity131, UUID> {
    List<EnterpriseBillingEntity131> findByName(String name);
    List<EnterpriseBillingEntity131> findByStatus(String status);
    List<EnterpriseBillingEntity131> findByType(String type);
    List<EnterpriseBillingEntity131> findByIsActiveTrue();
}
