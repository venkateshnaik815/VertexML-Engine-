package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity106;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity106Repository extends JpaRepository<EnterpriseBillingEntity106, UUID> {
    List<EnterpriseBillingEntity106> findByName(String name);
    List<EnterpriseBillingEntity106> findByStatus(String status);
    List<EnterpriseBillingEntity106> findByType(String type);
    List<EnterpriseBillingEntity106> findByIsActiveTrue();
}
