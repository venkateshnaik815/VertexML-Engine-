package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity104;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity104Repository extends JpaRepository<EnterpriseBillingEntity104, UUID> {
    List<EnterpriseBillingEntity104> findByName(String name);
    List<EnterpriseBillingEntity104> findByStatus(String status);
    List<EnterpriseBillingEntity104> findByType(String type);
    List<EnterpriseBillingEntity104> findByIsActiveTrue();
}
