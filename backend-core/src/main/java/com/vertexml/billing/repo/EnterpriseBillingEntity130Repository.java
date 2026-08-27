package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity130;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity130Repository extends JpaRepository<EnterpriseBillingEntity130, UUID> {
    List<EnterpriseBillingEntity130> findByName(String name);
    List<EnterpriseBillingEntity130> findByStatus(String status);
    List<EnterpriseBillingEntity130> findByType(String type);
    List<EnterpriseBillingEntity130> findByIsActiveTrue();
}
