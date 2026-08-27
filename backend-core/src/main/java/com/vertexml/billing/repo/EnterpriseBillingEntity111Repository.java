package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity111;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity111Repository extends JpaRepository<EnterpriseBillingEntity111, UUID> {
    List<EnterpriseBillingEntity111> findByName(String name);
    List<EnterpriseBillingEntity111> findByStatus(String status);
    List<EnterpriseBillingEntity111> findByType(String type);
    List<EnterpriseBillingEntity111> findByIsActiveTrue();
}
