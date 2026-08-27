package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity13;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity13Repository extends JpaRepository<EnterpriseBillingEntity13, UUID> {
    List<EnterpriseBillingEntity13> findByName(String name);
    List<EnterpriseBillingEntity13> findByStatus(String status);
    List<EnterpriseBillingEntity13> findByType(String type);
    List<EnterpriseBillingEntity13> findByIsActiveTrue();
}
