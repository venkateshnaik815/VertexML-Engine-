package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity7;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity7Repository extends JpaRepository<EnterpriseBillingEntity7, UUID> {
    List<EnterpriseBillingEntity7> findByName(String name);
    List<EnterpriseBillingEntity7> findByStatus(String status);
    List<EnterpriseBillingEntity7> findByType(String type);
    List<EnterpriseBillingEntity7> findByIsActiveTrue();
}
