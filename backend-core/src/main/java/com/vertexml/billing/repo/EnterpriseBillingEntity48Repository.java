package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity48;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity48Repository extends JpaRepository<EnterpriseBillingEntity48, UUID> {
    List<EnterpriseBillingEntity48> findByName(String name);
    List<EnterpriseBillingEntity48> findByStatus(String status);
    List<EnterpriseBillingEntity48> findByType(String type);
    List<EnterpriseBillingEntity48> findByIsActiveTrue();
}
