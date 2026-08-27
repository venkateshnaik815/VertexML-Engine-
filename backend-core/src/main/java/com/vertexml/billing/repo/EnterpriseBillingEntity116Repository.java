package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity116;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity116Repository extends JpaRepository<EnterpriseBillingEntity116, UUID> {
    List<EnterpriseBillingEntity116> findByName(String name);
    List<EnterpriseBillingEntity116> findByStatus(String status);
    List<EnterpriseBillingEntity116> findByType(String type);
    List<EnterpriseBillingEntity116> findByIsActiveTrue();
}
