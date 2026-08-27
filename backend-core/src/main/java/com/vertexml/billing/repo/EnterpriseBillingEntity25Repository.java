package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity25;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity25Repository extends JpaRepository<EnterpriseBillingEntity25, UUID> {
    List<EnterpriseBillingEntity25> findByName(String name);
    List<EnterpriseBillingEntity25> findByStatus(String status);
    List<EnterpriseBillingEntity25> findByType(String type);
    List<EnterpriseBillingEntity25> findByIsActiveTrue();
}
