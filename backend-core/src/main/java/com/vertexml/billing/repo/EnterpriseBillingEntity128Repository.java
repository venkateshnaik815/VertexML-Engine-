package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity128;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity128Repository extends JpaRepository<EnterpriseBillingEntity128, UUID> {
    List<EnterpriseBillingEntity128> findByName(String name);
    List<EnterpriseBillingEntity128> findByStatus(String status);
    List<EnterpriseBillingEntity128> findByType(String type);
    List<EnterpriseBillingEntity128> findByIsActiveTrue();
}
