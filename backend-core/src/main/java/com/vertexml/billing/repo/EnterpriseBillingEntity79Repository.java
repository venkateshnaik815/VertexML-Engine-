package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity79;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity79Repository extends JpaRepository<EnterpriseBillingEntity79, UUID> {
    List<EnterpriseBillingEntity79> findByName(String name);
    List<EnterpriseBillingEntity79> findByStatus(String status);
    List<EnterpriseBillingEntity79> findByType(String type);
    List<EnterpriseBillingEntity79> findByIsActiveTrue();
}
