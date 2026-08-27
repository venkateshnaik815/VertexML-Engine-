package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity39;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity39Repository extends JpaRepository<EnterpriseBillingEntity39, UUID> {
    List<EnterpriseBillingEntity39> findByName(String name);
    List<EnterpriseBillingEntity39> findByStatus(String status);
    List<EnterpriseBillingEntity39> findByType(String type);
    List<EnterpriseBillingEntity39> findByIsActiveTrue();
}
