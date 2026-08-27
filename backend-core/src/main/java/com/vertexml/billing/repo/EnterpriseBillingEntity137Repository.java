package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity137;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity137Repository extends JpaRepository<EnterpriseBillingEntity137, UUID> {
    List<EnterpriseBillingEntity137> findByName(String name);
    List<EnterpriseBillingEntity137> findByStatus(String status);
    List<EnterpriseBillingEntity137> findByType(String type);
    List<EnterpriseBillingEntity137> findByIsActiveTrue();
}
