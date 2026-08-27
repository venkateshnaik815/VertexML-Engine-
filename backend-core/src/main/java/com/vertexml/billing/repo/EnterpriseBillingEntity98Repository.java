package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity98;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity98Repository extends JpaRepository<EnterpriseBillingEntity98, UUID> {
    List<EnterpriseBillingEntity98> findByName(String name);
    List<EnterpriseBillingEntity98> findByStatus(String status);
    List<EnterpriseBillingEntity98> findByType(String type);
    List<EnterpriseBillingEntity98> findByIsActiveTrue();
}
