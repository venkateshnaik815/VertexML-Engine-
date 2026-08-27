package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity34;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity34Repository extends JpaRepository<EnterpriseBillingEntity34, UUID> {
    List<EnterpriseBillingEntity34> findByName(String name);
    List<EnterpriseBillingEntity34> findByStatus(String status);
    List<EnterpriseBillingEntity34> findByType(String type);
    List<EnterpriseBillingEntity34> findByIsActiveTrue();
}
