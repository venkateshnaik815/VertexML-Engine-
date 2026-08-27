package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity139;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity139Repository extends JpaRepository<EnterpriseBillingEntity139, UUID> {
    List<EnterpriseBillingEntity139> findByName(String name);
    List<EnterpriseBillingEntity139> findByStatus(String status);
    List<EnterpriseBillingEntity139> findByType(String type);
    List<EnterpriseBillingEntity139> findByIsActiveTrue();
}
