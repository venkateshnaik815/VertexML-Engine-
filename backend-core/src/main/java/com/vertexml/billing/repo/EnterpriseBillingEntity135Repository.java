package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity135;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity135Repository extends JpaRepository<EnterpriseBillingEntity135, UUID> {
    List<EnterpriseBillingEntity135> findByName(String name);
    List<EnterpriseBillingEntity135> findByStatus(String status);
    List<EnterpriseBillingEntity135> findByType(String type);
    List<EnterpriseBillingEntity135> findByIsActiveTrue();
}
