package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity124;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity124Repository extends JpaRepository<EnterpriseBillingEntity124, UUID> {
    List<EnterpriseBillingEntity124> findByName(String name);
    List<EnterpriseBillingEntity124> findByStatus(String status);
    List<EnterpriseBillingEntity124> findByType(String type);
    List<EnterpriseBillingEntity124> findByIsActiveTrue();
}
