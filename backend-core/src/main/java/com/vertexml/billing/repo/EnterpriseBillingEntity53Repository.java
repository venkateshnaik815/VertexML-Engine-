package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity53;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity53Repository extends JpaRepository<EnterpriseBillingEntity53, UUID> {
    List<EnterpriseBillingEntity53> findByName(String name);
    List<EnterpriseBillingEntity53> findByStatus(String status);
    List<EnterpriseBillingEntity53> findByType(String type);
    List<EnterpriseBillingEntity53> findByIsActiveTrue();
}
