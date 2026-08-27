package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity69;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity69Repository extends JpaRepository<EnterpriseBillingEntity69, UUID> {
    List<EnterpriseBillingEntity69> findByName(String name);
    List<EnterpriseBillingEntity69> findByStatus(String status);
    List<EnterpriseBillingEntity69> findByType(String type);
    List<EnterpriseBillingEntity69> findByIsActiveTrue();
}
