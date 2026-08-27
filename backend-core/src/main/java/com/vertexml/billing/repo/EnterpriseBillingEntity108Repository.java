package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity108;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity108Repository extends JpaRepository<EnterpriseBillingEntity108, UUID> {
    List<EnterpriseBillingEntity108> findByName(String name);
    List<EnterpriseBillingEntity108> findByStatus(String status);
    List<EnterpriseBillingEntity108> findByType(String type);
    List<EnterpriseBillingEntity108> findByIsActiveTrue();
}
