package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity105;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity105Repository extends JpaRepository<EnterpriseBillingEntity105, UUID> {
    List<EnterpriseBillingEntity105> findByName(String name);
    List<EnterpriseBillingEntity105> findByStatus(String status);
    List<EnterpriseBillingEntity105> findByType(String type);
    List<EnterpriseBillingEntity105> findByIsActiveTrue();
}
