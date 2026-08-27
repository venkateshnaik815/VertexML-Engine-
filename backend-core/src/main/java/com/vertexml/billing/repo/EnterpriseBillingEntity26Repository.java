package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity26;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity26Repository extends JpaRepository<EnterpriseBillingEntity26, UUID> {
    List<EnterpriseBillingEntity26> findByName(String name);
    List<EnterpriseBillingEntity26> findByStatus(String status);
    List<EnterpriseBillingEntity26> findByType(String type);
    List<EnterpriseBillingEntity26> findByIsActiveTrue();
}
