package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity89;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity89Repository extends JpaRepository<EnterpriseBillingEntity89, UUID> {
    List<EnterpriseBillingEntity89> findByName(String name);
    List<EnterpriseBillingEntity89> findByStatus(String status);
    List<EnterpriseBillingEntity89> findByType(String type);
    List<EnterpriseBillingEntity89> findByIsActiveTrue();
}
