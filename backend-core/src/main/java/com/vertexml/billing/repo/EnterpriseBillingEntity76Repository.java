package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity76;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity76Repository extends JpaRepository<EnterpriseBillingEntity76, UUID> {
    List<EnterpriseBillingEntity76> findByName(String name);
    List<EnterpriseBillingEntity76> findByStatus(String status);
    List<EnterpriseBillingEntity76> findByType(String type);
    List<EnterpriseBillingEntity76> findByIsActiveTrue();
}
