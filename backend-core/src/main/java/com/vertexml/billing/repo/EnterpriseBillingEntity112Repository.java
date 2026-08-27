package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity112;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity112Repository extends JpaRepository<EnterpriseBillingEntity112, UUID> {
    List<EnterpriseBillingEntity112> findByName(String name);
    List<EnterpriseBillingEntity112> findByStatus(String status);
    List<EnterpriseBillingEntity112> findByType(String type);
    List<EnterpriseBillingEntity112> findByIsActiveTrue();
}
