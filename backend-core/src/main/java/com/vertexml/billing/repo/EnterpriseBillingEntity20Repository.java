package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity20;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity20Repository extends JpaRepository<EnterpriseBillingEntity20, UUID> {
    List<EnterpriseBillingEntity20> findByName(String name);
    List<EnterpriseBillingEntity20> findByStatus(String status);
    List<EnterpriseBillingEntity20> findByType(String type);
    List<EnterpriseBillingEntity20> findByIsActiveTrue();
}
