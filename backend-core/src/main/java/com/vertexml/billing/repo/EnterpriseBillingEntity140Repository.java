package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity140;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity140Repository extends JpaRepository<EnterpriseBillingEntity140, UUID> {
    List<EnterpriseBillingEntity140> findByName(String name);
    List<EnterpriseBillingEntity140> findByStatus(String status);
    List<EnterpriseBillingEntity140> findByType(String type);
    List<EnterpriseBillingEntity140> findByIsActiveTrue();
}
