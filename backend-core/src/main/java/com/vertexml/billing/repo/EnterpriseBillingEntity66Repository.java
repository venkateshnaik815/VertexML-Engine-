package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity66;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity66Repository extends JpaRepository<EnterpriseBillingEntity66, UUID> {
    List<EnterpriseBillingEntity66> findByName(String name);
    List<EnterpriseBillingEntity66> findByStatus(String status);
    List<EnterpriseBillingEntity66> findByType(String type);
    List<EnterpriseBillingEntity66> findByIsActiveTrue();
}
