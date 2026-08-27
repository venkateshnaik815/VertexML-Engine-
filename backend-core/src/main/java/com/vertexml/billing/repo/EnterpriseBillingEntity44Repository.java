package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity44;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity44Repository extends JpaRepository<EnterpriseBillingEntity44, UUID> {
    List<EnterpriseBillingEntity44> findByName(String name);
    List<EnterpriseBillingEntity44> findByStatus(String status);
    List<EnterpriseBillingEntity44> findByType(String type);
    List<EnterpriseBillingEntity44> findByIsActiveTrue();
}
