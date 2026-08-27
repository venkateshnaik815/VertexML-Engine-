package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity118;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity118Repository extends JpaRepository<EnterpriseBillingEntity118, UUID> {
    List<EnterpriseBillingEntity118> findByName(String name);
    List<EnterpriseBillingEntity118> findByStatus(String status);
    List<EnterpriseBillingEntity118> findByType(String type);
    List<EnterpriseBillingEntity118> findByIsActiveTrue();
}
