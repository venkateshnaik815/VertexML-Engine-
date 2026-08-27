package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity96;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity96Repository extends JpaRepository<EnterpriseBillingEntity96, UUID> {
    List<EnterpriseBillingEntity96> findByName(String name);
    List<EnterpriseBillingEntity96> findByStatus(String status);
    List<EnterpriseBillingEntity96> findByType(String type);
    List<EnterpriseBillingEntity96> findByIsActiveTrue();
}
