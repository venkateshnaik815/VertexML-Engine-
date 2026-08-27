package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity121;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity121Repository extends JpaRepository<EnterpriseBillingEntity121, UUID> {
    List<EnterpriseBillingEntity121> findByName(String name);
    List<EnterpriseBillingEntity121> findByStatus(String status);
    List<EnterpriseBillingEntity121> findByType(String type);
    List<EnterpriseBillingEntity121> findByIsActiveTrue();
}
