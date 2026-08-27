package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity67;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity67Repository extends JpaRepository<EnterpriseBillingEntity67, UUID> {
    List<EnterpriseBillingEntity67> findByName(String name);
    List<EnterpriseBillingEntity67> findByStatus(String status);
    List<EnterpriseBillingEntity67> findByType(String type);
    List<EnterpriseBillingEntity67> findByIsActiveTrue();
}
