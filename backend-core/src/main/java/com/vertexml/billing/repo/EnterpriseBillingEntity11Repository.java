package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity11;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity11Repository extends JpaRepository<EnterpriseBillingEntity11, UUID> {
    List<EnterpriseBillingEntity11> findByName(String name);
    List<EnterpriseBillingEntity11> findByStatus(String status);
    List<EnterpriseBillingEntity11> findByType(String type);
    List<EnterpriseBillingEntity11> findByIsActiveTrue();
}
