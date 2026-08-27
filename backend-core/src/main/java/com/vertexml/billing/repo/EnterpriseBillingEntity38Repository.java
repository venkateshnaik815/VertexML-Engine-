package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity38;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity38Repository extends JpaRepository<EnterpriseBillingEntity38, UUID> {
    List<EnterpriseBillingEntity38> findByName(String name);
    List<EnterpriseBillingEntity38> findByStatus(String status);
    List<EnterpriseBillingEntity38> findByType(String type);
    List<EnterpriseBillingEntity38> findByIsActiveTrue();
}
