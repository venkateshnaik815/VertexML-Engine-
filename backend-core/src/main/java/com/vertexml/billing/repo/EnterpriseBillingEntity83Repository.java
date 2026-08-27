package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity83;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity83Repository extends JpaRepository<EnterpriseBillingEntity83, UUID> {
    List<EnterpriseBillingEntity83> findByName(String name);
    List<EnterpriseBillingEntity83> findByStatus(String status);
    List<EnterpriseBillingEntity83> findByType(String type);
    List<EnterpriseBillingEntity83> findByIsActiveTrue();
}
