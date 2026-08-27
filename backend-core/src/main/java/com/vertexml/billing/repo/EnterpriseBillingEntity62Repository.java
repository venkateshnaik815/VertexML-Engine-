package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity62;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity62Repository extends JpaRepository<EnterpriseBillingEntity62, UUID> {
    List<EnterpriseBillingEntity62> findByName(String name);
    List<EnterpriseBillingEntity62> findByStatus(String status);
    List<EnterpriseBillingEntity62> findByType(String type);
    List<EnterpriseBillingEntity62> findByIsActiveTrue();
}
