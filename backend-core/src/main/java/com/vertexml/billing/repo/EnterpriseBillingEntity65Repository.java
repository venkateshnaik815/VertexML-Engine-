package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity65;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity65Repository extends JpaRepository<EnterpriseBillingEntity65, UUID> {
    List<EnterpriseBillingEntity65> findByName(String name);
    List<EnterpriseBillingEntity65> findByStatus(String status);
    List<EnterpriseBillingEntity65> findByType(String type);
    List<EnterpriseBillingEntity65> findByIsActiveTrue();
}
