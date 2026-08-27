package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity1;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity1Repository extends JpaRepository<EnterpriseBillingEntity1, UUID> {
    List<EnterpriseBillingEntity1> findByName(String name);
    List<EnterpriseBillingEntity1> findByStatus(String status);
    List<EnterpriseBillingEntity1> findByType(String type);
    List<EnterpriseBillingEntity1> findByIsActiveTrue();
}
