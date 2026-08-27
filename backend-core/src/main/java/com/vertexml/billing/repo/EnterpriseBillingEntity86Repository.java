package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity86;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity86Repository extends JpaRepository<EnterpriseBillingEntity86, UUID> {
    List<EnterpriseBillingEntity86> findByName(String name);
    List<EnterpriseBillingEntity86> findByStatus(String status);
    List<EnterpriseBillingEntity86> findByType(String type);
    List<EnterpriseBillingEntity86> findByIsActiveTrue();
}
