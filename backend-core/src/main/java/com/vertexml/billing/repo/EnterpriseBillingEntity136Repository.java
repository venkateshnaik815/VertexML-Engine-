package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity136;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity136Repository extends JpaRepository<EnterpriseBillingEntity136, UUID> {
    List<EnterpriseBillingEntity136> findByName(String name);
    List<EnterpriseBillingEntity136> findByStatus(String status);
    List<EnterpriseBillingEntity136> findByType(String type);
    List<EnterpriseBillingEntity136> findByIsActiveTrue();
}
