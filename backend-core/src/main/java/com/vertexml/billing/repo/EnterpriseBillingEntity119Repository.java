package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity119;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity119Repository extends JpaRepository<EnterpriseBillingEntity119, UUID> {
    List<EnterpriseBillingEntity119> findByName(String name);
    List<EnterpriseBillingEntity119> findByStatus(String status);
    List<EnterpriseBillingEntity119> findByType(String type);
    List<EnterpriseBillingEntity119> findByIsActiveTrue();
}
