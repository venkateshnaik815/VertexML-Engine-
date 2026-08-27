package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity57;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity57Repository extends JpaRepository<EnterpriseBillingEntity57, UUID> {
    List<EnterpriseBillingEntity57> findByName(String name);
    List<EnterpriseBillingEntity57> findByStatus(String status);
    List<EnterpriseBillingEntity57> findByType(String type);
    List<EnterpriseBillingEntity57> findByIsActiveTrue();
}
