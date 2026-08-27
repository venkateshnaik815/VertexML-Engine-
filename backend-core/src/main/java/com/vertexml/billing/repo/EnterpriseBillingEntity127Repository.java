package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity127;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity127Repository extends JpaRepository<EnterpriseBillingEntity127, UUID> {
    List<EnterpriseBillingEntity127> findByName(String name);
    List<EnterpriseBillingEntity127> findByStatus(String status);
    List<EnterpriseBillingEntity127> findByType(String type);
    List<EnterpriseBillingEntity127> findByIsActiveTrue();
}
