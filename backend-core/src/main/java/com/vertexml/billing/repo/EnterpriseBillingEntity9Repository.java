package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity9;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity9Repository extends JpaRepository<EnterpriseBillingEntity9, UUID> {
    List<EnterpriseBillingEntity9> findByName(String name);
    List<EnterpriseBillingEntity9> findByStatus(String status);
    List<EnterpriseBillingEntity9> findByType(String type);
    List<EnterpriseBillingEntity9> findByIsActiveTrue();
}
