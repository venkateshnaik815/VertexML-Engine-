package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity126;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity126Repository extends JpaRepository<EnterpriseBillingEntity126, UUID> {
    List<EnterpriseBillingEntity126> findByName(String name);
    List<EnterpriseBillingEntity126> findByStatus(String status);
    List<EnterpriseBillingEntity126> findByType(String type);
    List<EnterpriseBillingEntity126> findByIsActiveTrue();
}
