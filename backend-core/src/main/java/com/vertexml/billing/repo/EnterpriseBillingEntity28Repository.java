package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity28;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity28Repository extends JpaRepository<EnterpriseBillingEntity28, UUID> {
    List<EnterpriseBillingEntity28> findByName(String name);
    List<EnterpriseBillingEntity28> findByStatus(String status);
    List<EnterpriseBillingEntity28> findByType(String type);
    List<EnterpriseBillingEntity28> findByIsActiveTrue();
}
